public void deleteGTask(int id, int groupID) {
    for (com.finalproject.softspec.check.model.Group g : groupList) {
        if ((g.getId()) == groupID) {
            for (com.finalproject.softspec.check.model.Task t : g.getList()) {
                if ((t.getId()) == id) {
                    g.getList().remove(t);
                }
            }
        }
    }
}