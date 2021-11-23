private void PrimaryColourChanged() {
    com.raggamuffin.protorunnerv2.vehicles.Runner player = m_Game.GetVehicleManager().GetPlayer();
    if (player == null)
        return ;
    
    m_Counter = 0;
    m_PreviousColour.SetColour(m_PrimaryColour);
    m_NextColour.SetColour(GetColourByWeaponSlot(player.GetWeaponSlot()));
}