public void disposeModal() {
    org.xodia.usai2d.Dialog d = getFocusedDialog();
    if (d.isModal()) {
        d.getDialogListener().onExit();
        isFocused = false;
        d.setFocused(false);
        org.xodia.usai2d.KeyManager.getInstance().remove(d);
        modalList.remove(d);
        revalidateFocus();
    }
}