@java.lang.Override
protected void save() {
    if (isRoot()) {
        daoSave.save(this);
    }
}