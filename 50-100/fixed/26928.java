private void resolveImpact(com.pucpr.game.states.game.engine.ActorObject ob, java.util.List<com.pucpr.game.states.game.engine.ActorObject> actors) {
    for (com.pucpr.game.states.game.engine.ActorObject act : actors) {
        if ((!(ob.equals(act))) && ((ob.getLastWorldPos().dst(act.getLastWorldPos())) <= ((ob.getRadius()) + (act.getRadius())))) {
            ob.contact(act);
        }
    }
}