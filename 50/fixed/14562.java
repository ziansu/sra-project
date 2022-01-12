private void appendMessage(lab3.Transfer t) {
    _floatingMessages.get(t.getSnapshotToken()).add(t);
}