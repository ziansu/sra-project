private java.util.ArrayList<java.lang.Integer> getMyQueens() {
    java.util.ArrayList<java.lang.Integer> ret = new java.util.ArrayList();
    for (client.Cell walk : client.AI.world.getMap().getMyCells()) {
        if ((walk == null) || ((walk.getBeetle()) == null))
            continue;
        
        if (((client.Beetle) (walk.getBeetle())).has_winge())
            ret.add(walk.getBeetle().getId());
        
    }
    return ret;
}