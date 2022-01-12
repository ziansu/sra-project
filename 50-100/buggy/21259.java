@java.lang.Override
public void run() {
    Lijstje = a.getLijst();
    progress.dismiss();
    android.app.FragmentManager fragmentManager = getFragmentManager();
    android.app.FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
    nmct.howest.be.desproject.MainFragment fragment1 = new nmct.howest.be.desproject.MainFragment().newInstance(Lijstje);
    fragmentTransaction.add(R.id.container, fragment1, "mainfrag");
    fragmentTransaction.commit();
}