@java.lang.Override
public void delWidget(int oldId) {
    java.util.List<java.lang.Integer> ids = this.getIds();
    if (!(ids.contains(oldId))) {
        return ;
    }
    ids.remove(((java.lang.Integer) (oldId)));
    this.setIds(ids);
}