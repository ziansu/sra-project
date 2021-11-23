public void update(float dt) {
    float x = m_GameObject.getTransform().getPosition().x;
    if (x >= (com.theders.dersdroidengine.view.GameView.WIDTH))
        m_GameObject.destroy();
    
    x += (m_Speed) * dt;
    m_GameObject.getTransform().translate(x, 0, 0);
}