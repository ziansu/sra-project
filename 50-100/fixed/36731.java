@java.lang.Override
public void onClick(android.view.View btn0) {
    android.widget.Spinner sp = ((android.widget.Spinner) (activity.mSectionsPagerAdapter.getItem(Frags.itQuick.ordinal()).getRootView().findViewById(R.id.location)));
    if (activity.getSkyData().isLocationDummy()) {
        sp.setSelection(0);
    }
    this.dismiss();
}