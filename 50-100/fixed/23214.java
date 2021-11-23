public fr.ttfx.cow4.world.AI getAiById(java.lang.Long id) {
    if (getMyAI().getId().equals(id)) {
        return getMyAI();
    }else
        if (getEnnemyAI().getId().equals(id)) {
            return getEnnemyAI();
        }else
            if (getChicken().getId().equals(id)) {
                return getChicken();
            }
        
    
    return null;
}