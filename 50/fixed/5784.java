public com.makeurpicks.domain.Pick makePick(com.makeurpicks.domain.Pick pick) {
    java.lang.String id = java.util.UUID.randomUUID().toString();
    pick.setId(id);
    pick = pickRepository.save(pick);
    picksByWeekRepository.createPick(pick);
    return pick;
}