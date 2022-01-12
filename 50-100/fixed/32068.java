@java.lang.Override
public boolean onProfileChanged(android.view.View view, com.mikepenz.materialdrawer.model.interfaces.IProfile profile, boolean currentProfile) {
    android.content.Intent intent = new android.content.Intent(this, org.techteam.decider.gui.activities.ProfileActivity.class);
    java.lang.String uid = org.techteam.decider.rest.api.ApiUI.getCurrentUserId(this);
    intent.putExtra(ProfileActivity.USER_ID, uid);
    startActivity(intent);
    return true;
}