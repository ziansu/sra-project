@java.lang.Override
public void onSuccess(com.google.firebase.storage.UploadTask.TaskSnapshot taskSnapshot) {
    @java.lang.SuppressWarnings(value = "VisibleForTests")
    android.net.Uri downloadUrl = taskSnapshot.getDownloadUrl();
    android.support.design.widget.Snackbar.make(findViewById(android.R.id.content), getString(R.string.uploading_message), Snackbar.LENGTH_LONG).show();
    personalPlan.setImageUrl(downloadUrl.toString());
    personalPlanDatabaseRef.child(personalPlanId).setValue(personalPlan);
    createPlanInSingleInvitee(userId, personalPlanId);
    finish();
}