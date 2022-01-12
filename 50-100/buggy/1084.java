@java.lang.Override
public void onClick(android.view.View v) {
    android.support.v4.app.FragmentActivity activity = ((android.support.v4.app.FragmentActivity) (getContext()));
    android.content.Intent i = new android.content.Intent(activity, com.ankurmittal.learning.ProfilePicDialogActivity.class);
    i.putExtra("imgUrlFrmAdapter", mChatItems.get(position).imgUrl);
    android.view.View sharedView = holder.userImageView;
    java.lang.String transitionName = "dialogTransition";
    android.app.ActivityOptions transitionActivityOptions = android.app.ActivityOptions.makeSceneTransitionAnimation(activity, sharedView, transitionName);
    activity.startActivity(i, transitionActivityOptions.toBundle());
    android.util.Log.e("clicked", "clicked");
}