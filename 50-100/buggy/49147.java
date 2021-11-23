public java.lang.Iterable<com.cowking96.mondb.model.Monster> findByCriteria(java.lang.String name, com.cowking96.mondb.model.MonsterType[] type, java.lang.Float cr, java.lang.String crComparison, java.lang.Integer xpValue, java.lang.String pageNumber) {
    com.querydsl.core.types.Predicate predicate = predicateBuilder.buildPredicate(name, type, cr, crComparison, xpValue, pageNumber);
    if (predicate == null) {
        com.cowking96.mondb.service.MonsterServiceImpl.LOG.debug("Our Predicate is: null. Searching for all monsters");
    }else {
        com.cowking96.mondb.service.MonsterServiceImpl.LOG.debug("Our Predicate is: {}", predicate.toString());
    }
    return monsterRepository.findAll(predicate);
}