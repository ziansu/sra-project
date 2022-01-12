public void add(int actTypeId, int pasTypeId, double scoreChange) {
    controllers.singlePlayer.ehauckdo.KBEvoMCTS.KnowledgeBase.EventRecord er = events.get(getCantorPairingId(actTypeId, pasTypeId));
    if (er != null) {
        er.addOccurrence(scoreChange);
    }else {
        er = new controllers.singlePlayer.ehauckdo.KBEvoMCTS.KnowledgeBase.EventRecord(actTypeId, pasTypeId, scoreChange);
        events.put(getCantorPairingId(pasTypeId, pasTypeId), er);
    }
}