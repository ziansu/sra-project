public void showCode() {
    if ((bloxsClass) != null) {
        textArea.setText(bloxsClass.getJavaCode());
        textArea.setText(lu.fisch.moenagade.model.Library.getInstance().getBloxsEditor().getXml());
    }
}