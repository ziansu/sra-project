@java.lang.Override
public java.lang.String doSaveEdit() {
    entity.setOwner(sessionData.getLoggedUser());
    sessionData.getLoggedUser().setCar(entity);
    return super.doSaveEdit();
}