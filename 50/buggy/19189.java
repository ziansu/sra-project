private void updateStatusText() {
    org.empyrn.darkknight.GUIInterface guiInterface = getGui();
    if (guiInterface != null) {
        getGui().setStatusString(getStatusText());
    }
}