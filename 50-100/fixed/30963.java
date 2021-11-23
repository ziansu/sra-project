public void actionPerformed(java.awt.event.ActionEvent arg0) {
    this.modifier = ((platform.plugins.IModifier) (platform.Platform.loadPlugin(list.get(index), platform.plugins.IModifier.class)));
    if ((modifier) != null) {
        this.modifier.modify(frame, frame.getAgenda(), event);
    }
}