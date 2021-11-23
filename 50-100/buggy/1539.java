public void reset() {
    m_isJumping = false;
    m_x = Constants.GROUND_X;
    m_y = Constants.GROUND_Y;
    m_rect.left = m_x;
    m_rect.top = m_y;
    m_rect.bottom = (m_y) + (m_h);
    m_rect.right = (m_x) + (m_w);
    m_curFrame = 0;
    m_lastFrameSwitch = java.lang.System.currentTimeMillis();
    m_lastUpdate = java.lang.System.currentTimeMillis();
}