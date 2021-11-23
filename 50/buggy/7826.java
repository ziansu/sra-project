@java.lang.Override
protected void onStartView() {
    timber.log.Timber.d("onStartView");
    commitFragment(activity, com.uramonk.androidtemplateapp.view.MainFragment.newInstance(), R.id.container);
}