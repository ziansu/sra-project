public static java.lang.Object[] valuesForUpdate(bo.upas.UsergroupBo bo) {
    return new java.lang.Object[]{ bo.isGod() ? 1 : 0 , bo.getTitle() , bo.getDescription() };
}