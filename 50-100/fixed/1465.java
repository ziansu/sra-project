public java.lang.String getTaskTag(long id) {
    for (int i = 0; i < (edu.blackburn.cs.oclam.Database.TaskList.tasksBag.size()); i++) {
        edu.blackburn.cs.oclam.Database.Task test = ((edu.blackburn.cs.oclam.Database.Task) (edu.blackburn.cs.oclam.Database.TaskList.tasksBag.get(i)));
        if (id == (test.getId())) {
            return test.getTag();
        }
    }
    java.lang.String nullString = "Description Not Found";
    return nullString;
}