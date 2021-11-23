public void addChecker(jetbrains.mps.nodeEditor.checking.BaseEditorChecker checker) {
    if (jetbrains.mps.RuntimeFlags.isTestMode())
        return ;
    
    if (checker != null) {
        synchronized(jetbrains.mps.nodeEditor.Highlighter.CHECKERS_LOCK) {
            myCheckers.add(checker);
        }
        addPendingAction(new java.lang.Runnable() {
            @java.lang.Override
            public void run() {
                myCheckedOnceEditors.clear();
                myInspectorMessagesCreated = false;
            }
        });
    }
}