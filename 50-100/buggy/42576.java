@java.lang.Override
public bolts.Task<java.lang.Void> then(bolts.Task<java.lang.Void> task) throws java.lang.Exception {
    android.util.Log.d("created objectId", created.getObjectId());
    android.util.Log.d("student objectId", student.getObjectId());
    created.pinInBackground(Constants.PinNames.BlockStats);
    return com.cognitutor.cognistudyapp.ParseObjectSubclasses.StudentBlockStats.addBlockStatsToRelationAndSaveEventually(student, created).continueWith(new bolts.Continuation<java.lang.Void, java.lang.Void>() {
        @java.lang.Override
        public java.lang.Void then(bolts.Task<java.lang.Void> task) throws java.lang.Exception {
            return null;
        }
    });
}