@java.lang.Override
public final void componentResized(java.awt.event.ComponentEvent e) {
    if ((m_applet) == null)
        return ;
    
    if ((getMinimumSize().width) == 1) {
        setMinimumSize(getSize());
        m_applet.init();
        m_applet.start();
    }
    Game.Renderer.resize(getContentPane().getWidth(), getContentPane().getHeight());
}