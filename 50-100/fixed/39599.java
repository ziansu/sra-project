public void updatePreview() {
    try {
        if (!(new java.net.URL(fileField.getText()).getPath().equals("")))
            header.setIcon(getPreviewIcon(new java.io.File(new java.net.URL(fileField.getText()).getPath())));
        
    } catch (java.lang.Exception ex) {
        ex.printStackTrace();
    }
}