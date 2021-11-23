private void handleHit(java.lang.Package p) {
    int damage = ((java.lang.Integer) (p.getPayload()));
    int id = java.lang.Integer.parseInt(p.getExtra());
    java.lang.System.out.println(((id + "hit ") + (java.lang.Math.random())));
    for (Actors.Actor a : actorQueue) {
        if ((a.getID()) == id) {
            a.hit(damage);
        }
    }
}