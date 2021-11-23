public com.google.android.gms.tasks.Task<java.lang.Void> send(android.content.Context context) {
    project.sherpa.utilities.ContentProviderUtils.insertModel(context, this);
    return project.sherpa.utilities.FirebaseProviderUtils.insertOrUpdateModel(this);
}