@java.lang.Override
public java.lang.Void then(bolts.Task<com.parse.ParseObject> task) throws java.lang.Exception {
    com.cognitutor.cognistudyapp.ParseObjectSubclasses.StudentBlockStats blockStats = ((task.getResult()) == null) ? null : ((com.cognitutor.cognistudyapp.ParseObjectSubclasses.StudentBlockStats) (task.getResult()));
    com.cognitutor.cognistudyapp.ParseObjectSubclasses.StudentBlockStats.createIfNecessaryAndIncrement(blockStats, instance.getClass(), student, category, correct);
    return null;
}