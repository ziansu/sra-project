public void updatePassStats(int yds, boolean pic, boolean incompletion, boolean td, boolean fum) {
    passyds += yds;
    if (pic)
        (ints)++;
    
    if (!incompletion)
        (passcomps)++;
    
    if ((td && (!fum)) && (!pic))
        (passtds)++;
    
    (passatmpts)++;
}