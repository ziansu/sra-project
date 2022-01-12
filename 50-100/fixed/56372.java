public static void queueDestroy(me.apcs.bomberman.Inhabitant inhabitant) {
    try {
        for (int i = 0; i < (me.apcs.bomberman.Game.toDestroy.size()); i++)
            if (me.apcs.bomberman.Game.toDestroy.get(i).getId().equals(inhabitant.getId()))
                return ;
            
        
        me.apcs.bomberman.Game.toDestroy.add(inhabitant);
    } catch (java.lang.NullPointerException npe) {
        return ;
    }
}