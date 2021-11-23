public void actionPerformed(java.awt.event.ActionEvent event) {
    if ("cancel".equals(event.getActionCommand())) {
        if ((interactiveListener) != null) {
            color = initialColor;
            interactiveListener.done(color);
            interactiveListener = null;
        }else {
            color = null;
        }
    }else {
        interactiveListener = null;
    }
}