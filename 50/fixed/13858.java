void newFile() {
    if (changed) {
        confirmClose();
    }else {
        textArea.setText("");
        changed = false;
    }
}