public void applyPacket(level.maps.Level level) {
    if (level == null)
        return ;
    
    applyPacket(engine.GlobalData.getLevelMob(getUniqueID(), level));
}