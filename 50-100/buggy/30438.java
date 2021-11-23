@java.lang.Override
public final void componentResized(java.awt.event.ComponentEvent e) {
    if ((m_applet) == null)
        return ;
    
    if ((getMinimumSize().width) < 512)
        setMinimumSize(getSize());
    
    Game.Renderer.resize(getContentPane().getWidth(), getContentPane().getHeight());
}