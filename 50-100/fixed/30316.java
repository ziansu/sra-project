@java.lang.Override
public void onClick(android.view.View v) {
    switch (v.getId()) {
        case R.id.start_startedAsyncServiceBtn :
            mIsInterrupted = false;
            mServiceIntent.putExtra(MyStartedService.DELAY, mDuration.getProgress());
            context.startService(mServiceIntent);
            mStopBtn.setEnabled(true);
            mStatusText.setText(getString(R.string.started_msg));
            break;
        case R.id.stop_startedAsyncServiceBtnServiceBtn :
            mIsInterrupted = true;
            context.stopService(mServiceIntent);
            onServiceCompleted();
            break;
    }
}