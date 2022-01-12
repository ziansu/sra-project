public com.sbxcloud.android.sbxcloudsdk.query.SbxQueryBuilder filterWhereIsEqual(java.lang.String field, java.lang.Object value) throws java.lang.Exception {
    this.find.setReferenceJoin(com.sbxcloud.android.sbxcloudsdk.query.SbxQueryBuilder.OP.EQ, field, this.referenceField, this.referenceModel, value);
    return this.find;
}