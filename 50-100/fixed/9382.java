@java.lang.Override
public void onClick(android.view.View view) {
    java.lang.System.out.println("ClickHat");
    com.example.cookzyme.cookzyme.CanCookFragment canCook = new com.example.cookzyme.cookzyme.CanCookFragment();
    android.support.v4.app.FragmentTransaction transaction = getActivity().getSupportFragmentManager().beginTransaction();
    transaction.replace(R.id.refrigerator, canCook);
    transaction.addToBackStack(null);
    transaction.commit();
}