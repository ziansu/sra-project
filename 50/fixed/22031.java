@java.lang.Override
protected void save() {
    if ((isRoot()) && (null != (daoSave))) {
        daoSave.save(this);
    }
}