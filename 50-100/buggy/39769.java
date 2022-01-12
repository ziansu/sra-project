public void updateStatus() {
    int need = 0;
    for (de.tor.tribes.ui.wiz.ref.types.REFTargetElement elem : de.tor.tribes.ui.wiz.ref.SupportRefillSettingsPanel.getSingleton().getAllElements()) {
        need += elem.getNeededSupports();
    }
    jNeededSupports.setText(java.lang.Integer.toString(need));
    int available = 0;
    for (de.tor.tribes.ui.wiz.ref.types.REFSourceElement elem : de.tor.tribes.ui.wiz.ref.SupportRefillSourcePanel.getSingleton().getAllElements()) {
        need += elem.getAvailableSupports();
    }
    jAvailableSupports.setText(java.lang.Integer.toString(available));
}