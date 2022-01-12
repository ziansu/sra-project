private void addClipPanel(blue.score.layers.audio.core.AudioClip clip, blue.score.TimeState timeState, int y, int height) {
    blue.score.layers.audio.ui.AudioClipPanel panel = new blue.score.layers.audio.ui.AudioClipPanel(clip, timeState);
    panel.setBounds(panel.getX(), y, panel.getWidth(), height);
    add(panel, 0);
    clipPanelMap.put(clip, panel);
}