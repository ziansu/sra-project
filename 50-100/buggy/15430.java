public void resetCheckedState(final jetbrains.mps.nodeEditor.EditorComponent editorComponent) {
    runUpdateMessagesAction(new java.lang.Runnable() {
        @java.lang.Override
        public void run() {
            myForceUpdateInPowerSaveModeFlag = true;
            if (editorComponent instanceof jetbrains.mps.nodeEditor.inspector.InspectorEditorComponent) {
                myInspectorMessagesCreated = false;
                return ;
            }
            myCheckedOnceEditors.remove(editorComponent);
            synchronized(jetbrains.mps.nodeEditor.Highlighter.CHECKERS_LOCK) {
                for (jetbrains.mps.nodeEditor.checking.BaseEditorChecker checker : myCheckers) {
                    checker.resetCheckerStateProtected();
                }
            }
        }
    });
}