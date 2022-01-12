@java.lang.Override
public void onActivityCreated(android.os.Bundle savedInstanceState) {
    android.util.Log.d(com.incitorrent.radyo.menemen.pro.fragments.sohbet.TAG, "onActivityCreated");
    if (((savedInstanceState != null) && ((sohbetRV) != null)) && ((sohbetList) != null)) {
        first_visible_view = savedInstanceState.getInt("first_visible_view");
        new com.incitorrent.radyo.menemen.pro.fragments.sohbet.initsohbet(((first_visible_view) + 20), first_visible_view).execute();
        first_visit = false;
    }
    super.onActivityCreated(savedInstanceState);
}