public static void extractId(de.braintags.io.vertx.pojomapper.mapping.IMapper mapper, de.braintags.netrelay.controller.AbstractCaptureController.CaptureMap map, de.braintags.io.vertx.pojomapper.dataaccess.query.IQuery<?> query) {
    java.util.List<java.lang.String[]> ids = de.braintags.netrelay.controller.persistence.RecordContractor.extractIds(mapper, map);
    de.braintags.io.vertx.pojomapper.dataaccess.query.ISearchConditionContainer and = query.and();
    for (java.lang.String[] id : ids) {
        and.getConditions().add(query.isEqual(id[0], id[1]));
    }
    query.setSearchCondition(and);
}