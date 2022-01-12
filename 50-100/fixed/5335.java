public void spawn() {
    m_x = m_game.getWidth();
    m_y = (phoenix.delta.Utilities.random((((DroidConstants.GROUND_Y) - (m_game.getDroid().getHeight())) + (DroidConstants.JUMP_HEIGHT)), DroidConstants.GROUND_Y)) - (m_h);
    m_rect.top = m_y;
    m_rect.bottom = (m_y) + (m_h);
    m_alive = true;
    android.util.Log.i("DRJ", ("Spawning star at " + (m_x)));
}