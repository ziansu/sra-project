public com.raizlabs.android.dbflow.sql.builder.Condition collate(com.raizlabs.android.dbflow.annotation.Collate collation) {
    if (collation.equals(Collate.NONE)) {
        mPostArgument = null;
    }else {
        collate(collation.name());
    }
    return this;
}