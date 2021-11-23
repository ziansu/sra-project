public void add(int actSpriteId, int pasSpriteId, double scoreChange) {
    controllers.singlePlayer.ehauckdo.KBEvoMCTS.KnowledgeBase.EventRecord er = events.get(getCantorPairingId(pasSpriteId, pasSpriteId));
    if (er != null) {
        er.addOccurrence(scoreChange);
    }else {
        er = new controllers.singlePlayer.ehauckdo.KBEvoMCTS.KnowledgeBase.EventRecord(actSpriteId, pasSpriteId, scoreChange);
        events.put(getCantorPairingId(pasSpriteId, pasSpriteId), er);
    }
}