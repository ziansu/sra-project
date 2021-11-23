@java.lang.Override
public void onSuccess(com.google.firebase.storage.UploadTask.TaskSnapshot taskSnapshot) {
    @java.lang.SuppressWarnings(value = "VisibleForTests")
    android.net.Uri downloadUrl = taskSnapshot.getDownloadUrl();
    personalPlan.setImageUrl(downloadUrl.toString());
    personalPlanDatabaseRef.child(personalPlanId).setValue(personalPlan);
    createPlanInSingleInvitee(userId, personalPlanId);
    finish();
}