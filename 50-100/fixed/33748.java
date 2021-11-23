private java.util.ArrayList<client.Beetle> getMyQueens() {
    java.util.ArrayList<client.Beetle> ret = new java.util.ArrayList();
    for (client.Cell walk : client.AI.world.getMap().getMyCells()) {
        if ((walk == null) || ((walk.getBeetle()) == null))
            continue;
        
        if (((client.Beetle) (walk.getBeetle())).has_winge())
            ret.add(((client.Beetle) (walk.getBeetle())));
        
    }
    return ret;
}