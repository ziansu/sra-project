@java.lang.Override
public bolts.Task<java.lang.Void> then(bolts.Task<com.parse.ParseObject> task) throws java.lang.Exception {
    com.cognitutor.cognistudyapp.ParseObjectSubclasses.StudentBlockStats blockStats = ((task.getResult()) == null) ? null : ((com.cognitutor.cognistudyapp.ParseObjectSubclasses.StudentBlockStats) (task.getResult()));
    return com.cognitutor.cognistudyapp.ParseObjectSubclasses.StudentBlockStats.createIfNecessaryAndIncrement(blockStats, instance.getClass(), student, category, correct);
}