@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    be.howest.nmct.parking.LijstParkingsFragment lpf = new be.howest.nmct.parking.LijstParkingsFragment();
    android.app.FragmentManager fMgr = getFragmentManager();
    android.app.FragmentTransaction fTr = fMgr.beginTransaction();
    fTr.add(R.id.container, lpf, "lijst");
    fTr.commit();
}