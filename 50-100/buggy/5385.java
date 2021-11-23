public void run() {
    if ((thread) != current) {
        return ;
    }
    java.lang.String filter = filterTextField.getText();
    if ((filter.length()) == 0) {
        filter = null;
    }
    setFilter(filter);
}