public void rotateY(float angle) {
    com.base.engine.Vector3f hAxis = com.base.engine.Camera.m_yAxis.cross(m_forward).normalized();
    m_forward.rotate(angle, com.base.engine.Camera.m_yAxis).normalized();
    m_up = m_forward.cross(hAxis).normalized();
    java.lang.System.out.println(m_up);
}