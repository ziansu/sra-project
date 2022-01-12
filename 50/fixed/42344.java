@java.lang.Override
public void update(java.util.Observable o, java.lang.Object arg) {
    if (arg != null) {
        state = state.modelUpdated(o, arg, this.discardView, this.waitView);
    }
}