public void changeGTask(int id, int groupID, java.lang.String name) {
    for (com.finalproject.softspec.check.model.Group g : groupList) {
        for (com.finalproject.softspec.check.model.Task t : g.getList()) {
            if ((t.getId()) == id) {
                t.setName(name);
                break;
            }
        }
    }
}