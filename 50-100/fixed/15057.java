public final void handleEnter() {
    if (!(onAction())) {
        if ((sublevel.size) > 0) {
            if (!(onNextSublevel)) {
                onNextSublevel = true;
            }else {
                sublevel.get(selectedInSub).handleEnter();
            }
        }
    }
}