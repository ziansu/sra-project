@java.lang.Override
public void onItemClicked(com.yannickschuchmann.peng.model.entities.User user) {
    android.content.Intent intent = new android.content.Intent(getContext(), com.yannickschuchmann.peng.app.views.activities.ProfileActivity.class);
    intent.putExtra("userId", user.id);
    startActivityWithAnimation(intent);
}