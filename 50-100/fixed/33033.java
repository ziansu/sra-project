public void placeTeleportAreaEffectBeginning(Model.GameObject.AreaEffect.TeleportAreaEffect t) {
    try {
        tiles[t.getX()][t.getY()].setTeleportAreaEffectTile(t);
        tiles[t.getX()][t.getY()].alert();
        placeTeleportAreaEffectEnding(new Model.GameObject.AreaEffect.TeleportAreaEffect(t.getEndLocation(), t.getLocation()));
    } catch (java.lang.Exception e) {
        java.lang.System.out.println(e);
    }
}