private org.chromattic.api.query.Query<org.exoplatform.social.core.chromattic.entity.SpaceEntity> _getUnifiedSearchSpaces(java.lang.String userId, org.exoplatform.social.core.space.SpaceFilter spaceFilter) {
    org.chromattic.api.query.QueryBuilder<org.exoplatform.social.core.chromattic.entity.SpaceEntity> builder = getSession().createQueryBuilder(org.exoplatform.social.core.chromattic.entity.SpaceEntity.class);
    org.exoplatform.social.core.storage.query.WhereExpression whereExpression = new org.exoplatform.social.core.storage.query.WhereExpression();
    _applyUnifiedSearchFilter(whereExpression, spaceFilter);
    builder.where(whereExpression.toString());
    applyOrder(builder, spaceFilter);
    return builder.get();
}