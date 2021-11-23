public io.github.jevaengine.math.Vector3F boundLocation(io.github.jevaengine.math.Vector3F v) {
    if ((m_world) == null)
        return new io.github.jevaengine.math.Vector3F();
    
    return new io.github.jevaengine.math.Vector3F(java.lang.Math.min(((m_world.getBounds().width) - 1), java.lang.Math.max(0, v.x)), java.lang.Math.min(((m_world.getBounds().height) - 1), java.lang.Math.max(0, v.y)), v.z);
}