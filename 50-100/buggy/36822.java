@java.lang.Override
public void onItemClick(android.widget.AdapterView<?> parent, android.view.View view, int position, long id) {
    itemSelect = dataArrayList.get(position);
    android.app.Fragment fr = new com.example.framgianguyenhuyquyet.menuleft.activity.fragment.FragmentDetailPost();
    android.app.FragmentManager fm = getFragmentManager();
    android.app.FragmentTransaction fragmentTransaction = fm.beginTransaction();
    fragmentTransaction.replace(R.id.fragment, fr);
    fragmentTransaction.commit();
}