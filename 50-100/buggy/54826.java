private boolean composite(edu.rosehulman.haussmsg.ai.Actor actor, edu.rosehulman.haussmsg.world.GameWorld world, boolean or) {
    for (int i = 0; i < (vars.length); i++) {
        boolean res = ((edu.rosehulman.haussmsg.ai.Condition) (vars[i])).consider(actor, world);
        if (or && res)
            return true;
        
        if ((!or) && (!res))
            return false;
        
    }
    return false;
}