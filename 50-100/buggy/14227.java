private void SetIcon() {
    if (OS.contains("windows")) {
        setIconImage(java.awt.Toolkit.getDefaultToolkit().getImage(getClass().getResource("icon.png")));
    }else {
        setIconImage(java.awt.Toolkit.getDefaultToolkit().getImage(getClass().getResource("iconwhite.png")));
    }
}