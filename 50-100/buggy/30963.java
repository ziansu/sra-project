public void actionPerformed(java.awt.event.ActionEvent arg0) {
    this.modifier = ((platform.plugins.IModifier) (platform.Platform.loadPlugin(list.get(index), platform.plugins.IModifier.class)));
    this.modifier.modify(frame, frame.getAgenda(), event);
}