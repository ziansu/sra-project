public static void WindowLock(boolean lock) {
    org.mdpnp.smartcardio.lock.LockScreen.Window();
    org.mdpnp.smartcardio.lock.LockScreen.dialog.setVisible(true);
    org.mdpnp.smartcardio.lock.LockScreen.dialog.setModalityType(java.awt.Dialog.ModalityType.TOOLKIT_MODAL);
    lock = true;
}