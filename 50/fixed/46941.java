@java.lang.Override
public void setLocation(de.fau.cs.mad.wanthavers.common.Location location) {
    mFilterSettingFragBinding.setLocation(location);
    wanthavers.mad.cs.fau.de.wanthavers_android.baseclasses.WantHaversApplication.setLocation(location, getActivity().getApplicationContext());
    showLocationInView();
}