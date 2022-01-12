public java.lang.String getTaskTag(java.lang.String name) {
    for (int i = 0; i < (edu.blackburn.cs.oclam.Database.TaskList.tasksBag.size()); i++) {
        edu.blackburn.cs.oclam.Database.Task test = ((edu.blackburn.cs.oclam.Database.Task) (edu.blackburn.cs.oclam.Database.TaskList.tasksBag.get(i)));
        if (name.equals(test.getName())) {
            return test.getTag();
        }
    }
    java.lang.String nullString = "Description Not Found";
    return nullString;
}