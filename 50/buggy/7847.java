void save(java.lang.String saveDir) {
    entry.setContent(textArea.getText());
    entry.save(saveDir);
}