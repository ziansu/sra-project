public void run() {
    android.support.v4.app.FragmentTransaction tr = Data.mainAct.getFragmentManager().beginTransaction();
    tr.replace(R.id.content_frame, map.minimap.mainActivityComponents.LobbyFragment.newInstance("a", "b"));
    tr.commit();
}