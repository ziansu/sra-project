@java.lang.Override
public void onSuccess(com.google.firebase.storage.UploadTask.TaskSnapshot taskSnapshot) {
    java.lang.String downloadUrl = taskSnapshot.getDownloadUrl().toString();
    android.util.Log.i(com.google.codeu.chatme.presenter.CreateGroupPresenter.TAG, ("uploadGroupPicture:success:downloadUrl " + downloadUrl));
    updateGroupPhotoUrl(downloadUrl, conversationId);
    view.openMessageActivity(conversationId);
}