public void removeDialog(int index) {
    org.xodia.usai2d.Dialog d = dialogList.remove(index);
    if (d.isFocused()) {
        if ((d.getDialogListener()) != null)
            d.getDialogListener().onExit();
        
        d.setFocused(false);
        setFocused(false);
    }
    org.xodia.usai2d.KeyManager.getInstance().remove(d);
}