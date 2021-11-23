public long createList(long groupToBeDecorated) {
    long newuuid = calico.Calico.uuid();
    calico.controllers.CGroupDecoratorController.list_create(groupToBeDecorated, newuuid);
    return newuuid;
}