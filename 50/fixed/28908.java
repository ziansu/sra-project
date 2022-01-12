public void changePTask(int id, java.lang.String name) {
    for (com.finalproject.softspec.check.model.Task t : primaryList) {
        if ((t.getId()) == id) {
            t.setName(name);
            break;
        }
    }
}