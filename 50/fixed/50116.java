@java.lang.Override
public java.lang.Void then(bolts.Task<java.lang.Void> task) throws java.lang.Exception {
    com.cognitutor.cognistudyapp.Custom.ParseObjectUtils.logPinnedObjects(false);
    com.parse.ParseUser.logOut();
    return null;
}