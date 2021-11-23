public void deleteGroup(int groupID) {
    for (com.finalproject.softspec.check.model.Group g : groupList) {
        if ((g.getId()) == groupID) {
            g.clean();
            groupList.remove(g);
        }
    }
}