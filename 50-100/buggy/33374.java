@java.lang.Override
public void onStart() {
    super.onStart();
    android.app.FragmentManager fragmentManager = getFragmentManager();
    android.app.FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
    fragmentList = new no.hin.student.myassetmanager.Fragments.FragmentList();
    fragmentUser = new no.hin.student.myassetmanager.Fragments.FragmentUser();
    fragmentTransaction.add(R.id.fragment_container, fragmentList);
    fragmentTransaction.addToBackStack(null);
    fragmentTransaction.commit();
    fragmentManager.executePendingTransactions();
    no.hin.student.myassetmanager.Classes.WebAPI.doLoginAdmin(this);
    getCategories();
}