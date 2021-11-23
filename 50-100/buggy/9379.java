@java.lang.Override
public void onClick(android.view.View v) {
    java.lang.String personId = java.lang.String.valueOf(followersDTO.getId());
    monsterquiz.app.com.monsterquiz.fragments.FriendPrivateProfileFragment friendPrivateProfileFragment = new monsterquiz.app.com.monsterquiz.fragments.FriendPrivateProfileFragment();
    android.os.Bundle bundle = new android.os.Bundle();
    bundle.putSerializable("followers_profile", followersDTO);
    bundle.putString("cat_id", "0");
    bundle.putString("user_id", personId);
    friendPrivateProfileFragment.setArguments(bundle);
    ((monsterquiz.app.com.monsterquiz.HomeActivity) (context)).replaceFragment(friendPrivateProfileFragment);
}