public void On() {
    SetBaseColour(m_Anchor.GetAltColour());
    this.GetAltColour().Alpha = 0.0;
    m_State = com.raggamuffin.protorunnerv2.weapons.LaserPointer.LaserState.Activating;
    m_Timer.ResetTimer();
    m_On = true;
}