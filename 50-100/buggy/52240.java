public boolean isValid() {
    if (autoStart) {
        setStyle("");
        getFirstChild().setVisible(false);
        setBorder("none");
        setTitle(null);
        setVisible(false);
        appendChild(new org.adempiere.webui.apps.BusyDialog());
        processPanel.process();
    }
    return true;
}