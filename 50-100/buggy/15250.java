public int xpMath(solenus.gridemblem3.actor.Unit a, solenus.gridemblem3.actor.Unit b, int xp) {
    float ret = xp;
    if ((a.getLevel()) < (b.getLevel()))
        ret = ret + ((((a.getLevel()) - (b.getLevel())) * xp) * 0.2F);
    
    return ((int) (ret));
}