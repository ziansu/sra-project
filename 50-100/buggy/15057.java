public final void handleEnter() {
    if (((sublevel.size) > 0) && (!(onAction()))) {
        if (!(onNextSublevel)) {
            onNextSublevel = true;
        }else {
            sublevel.get(selectedInSub).handleEnter();
        }
    }
}