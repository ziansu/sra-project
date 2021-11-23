private void setGUIMode(sw.client.SWFrame.GUIMode mode) {
    if ((_activePanel) != null)
        this.remove(_activePanel);
    
    if (mode == (sw.client.SWFrame.GUIMode.LOGIN)) {
        _activePanel = _loginPanel;
    }else
        if (mode == (sw.client.SWFrame.GUIMode.GAME)) {
            _activePanel = _gamePanel;
        }
    
    this.add(_activePanel);
    java.lang.System.out.println("switch mode");
    this.setVisible(true);
    this.repaint();
}