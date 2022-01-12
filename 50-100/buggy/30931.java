@java.lang.Override
public void onItemClick(android.view.View imageView, int imageRefId, java.lang.String imageTransitionName) {
    final test.com.activitysharedelementtransition.intents.SingleImageIntent intent = new test.com.activitysharedelementtransition.intents.SingleImageIntent(this, imageRefId, imageTransitionName);
    final android.app.ActivityOptions options = android.app.ActivityOptions.makeSceneTransitionAnimation(this, imageView, imageTransitionName);
    setEnterSharedElementCallback(new test.com.activitysharedelementtransition.transition.MySharedElementCallback());
    startActivity(intent, options.toBundle());
}