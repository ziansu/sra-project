@java.lang.Override
public void onClick(android.view.View view) {
    com.example.mypulz.UICore.Detail.FindDoctorFragment dFragment = new com.example.mypulz.UICore.Detail.FindDoctorFragment();
    new Common.CommonFunction().changeFragment(dFragment, dFragment.getFragmentManager());
}