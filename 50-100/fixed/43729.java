public void addChecker(jetbrains.mps.nodeEditor.checking.BaseEditorChecker checker) {
    if (jetbrains.mps.RuntimeFlags.isTestMode())
        return ;
    
    if (checker != null) {
        myCheckers.add(checker);
        addPendingAction(new java.lang.Runnable() {
            @java.lang.Override
            public void run() {
                myCheckedOnceEditors.clear();
                myInspectorMessagesCreated = false;
            }
        });
    }
}