public static void WindowLock() {
    org.mdpnp.smartcardio.lock.LockScreen.locked = true;
    java.lang.System.out.println("Window was locked");
    org.mdpnp.smartcardio.lock.LockScreen.Window();
    org.mdpnp.smartcardio.lock.LockScreen.dialog.setVisible(true);
    org.mdpnp.smartcardio.lock.LockScreen.dialog.setModalityType(java.awt.Dialog.ModalityType.TOOLKIT_MODAL);
}