@java.lang.Override
public void stateChanged(de.uni_hildesheim.sse.model.confModel.Configuration config, de.uni_hildesheim.sse.model.confModel.IDecisionVariable changedVariable) {
    execOnParent(new java.lang.Runnable() {
        @java.lang.Override
        public void run() {
            refresh();
        }
    }, true);
}