@java.lang.Override
public void onClick(android.view.View view) {
    android.content.Intent profileViewIntent = new android.content.Intent(getApplicationContext(), com.socialteinc.socialate.ViewOtherUserProfile.class);
    profileViewIntent.putExtra("entertainmentUploader", mEntertainmentUploader);
    startActivity(profileViewIntent);
}