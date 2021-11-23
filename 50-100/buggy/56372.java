public static void queueDestroy(me.apcs.bomberman.Inhabitant i) {
    try {
        for (me.apcs.bomberman.Inhabitant inhabitant : me.apcs.bomberman.Game.toDestroy)
            if (i.getId().equals(inhabitant.getId()))
                return ;
            
        
        me.apcs.bomberman.Game.toDestroy.add(i);
    } catch (java.lang.NullPointerException npe) {
        return ;
    }
}