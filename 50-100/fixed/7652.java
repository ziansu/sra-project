public static void launch(info.papdt.express.helper.ui.AbsActivity mActivity, android.view.View fab) {
    android.content.Intent intent = new android.content.Intent(mActivity, info.papdt.express.helper.ui.AddActivity.class);
    intent.setFlags(Intent.FLAG_ACTIVITY_MULTIPLE_TASK);
    if (!(mActivity.mSets.getBoolean(Settings.KEY_DISABLE_ANIMATION, false))) {
        android.support.v4.app.ActivityOptionsCompat options = android.support.v4.app.ActivityOptionsCompat.makeSceneTransitionAnimation(mActivity, fab, info.papdt.express.helper.ui.AddActivity.TRANSITION_NAME_FAB);
        android.support.v4.app.ActivityCompat.startActivityForResult(mActivity, intent, MainActivity.REQUEST_ADD, options.toBundle());
    }else {
        mActivity.startActivityForResult(intent, MainActivity.REQUEST_ADD);
    }
}