public void refreshMutationPanel() {
    for (int i = 7; i >= 0; i--) {
        mutationPanel.setBiomorph(i, bm.getSpecific((i + 1)));
    }
}