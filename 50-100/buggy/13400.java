private void showHomeTimelineButton() {
    android.widget.TextView textView = showTextView(R.id.home_timeline, R.string.options_menu_home_timeline, state.builder.isPersistent());
    textView.setOnClickListener(new android.view.View.OnClickListener() {
        @java.lang.Override
        public void onClick(android.view.View v) {
            updateChangedFields();
            activityOnFinish = org.andstatus.app.account.AccountSettingsActivity.ActivityOnFinish.HOME;
            mIsFinishing = true;
            finish();
        }
    });
}