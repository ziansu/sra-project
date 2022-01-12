public static void showMessage(java.lang.String msg, char icon, int timeout) {
    com.codename1.components.ToastBar.Status s = com.codename1.components.ToastBar.getInstance().createStatus();
    com.codename1.ui.plaf.Style stl = com.codename1.ui.plaf.UIManager.getInstance().getComponentStyle(s.getMessageUIID());
    s.setIcon(com.codename1.ui.FontImage.createMaterial(icon, stl, 4));
    s.setMessage(msg);
    s.setExpires(timeout);
    s.show();
}