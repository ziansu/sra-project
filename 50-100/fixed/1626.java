public void rotateX(float angle) {
    com.base.engine.Vector3f hAxis = com.base.engine.Camera.m_yAxis.cross(m_forward).normalized();
    m_forward = m_forward.rotate(angle, hAxis).normalized();
    m_up = m_forward.cross(hAxis).normalized();
}