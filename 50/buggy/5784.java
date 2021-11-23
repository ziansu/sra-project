public com.makeurpicks.domain.Pick makePick(com.makeurpicks.domain.Pick pick) {
    pick.setId(java.util.UUID.randomUUID().toString());
    pickRepository.save(pick);
    picksByWeekRepository.createPick(pick);
    return pick;
}