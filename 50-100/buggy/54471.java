@java.lang.Override
public void onActivityResult(int requestCode, int resultCode, android.content.Intent data) {
    if (requestCode == (FRIENDS_ACTIVITY)) {
        if (resultCode == (com.insa.thibault.ihm.view.activity.FriendsActivity.RESULT_OK)) {
            java.util.List<com.insa.thibault.ihm.business.User> invitedFriends = data.getParcelableArrayListExtra(FriendsActivity.FRIENDS_LIST);
            android.widget.Toast.makeText(getContext(), invitedFriends.get(0).getFirstName(), Toast.LENGTH_LONG).show();
        }
    }
}