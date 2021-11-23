@java.lang.Override
public void mouseReleased(java.awt.event.MouseEvent me) {
    if (((m_currentParticle) != null) && (!(m_onLockdown))) {
        m_currentParticle.makeFree();
        m_currentParticle = null;
    }
}