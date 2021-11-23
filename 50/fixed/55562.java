@java.lang.Override
public java.lang.String doSaveEdit() {
    entity.setOwner(sessionData.getLoggedUser());
    return super.doSaveEdit();
}