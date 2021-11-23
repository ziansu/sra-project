@java.lang.Override
public java.util.List<com.ctrip.zeus.model.entity.Group> list() throws java.lang.Exception {
    java.util.List<com.ctrip.zeus.model.entity.Group> list = new java.util.ArrayList<>();
    for (com.ctrip.zeus.model.entity.Group group : groupQuery.getAll()) {
        list.add(group);
    }
    return list;
}