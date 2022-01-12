public void setUpViewQueueFragment() {
    android.app.FragmentManager fragmentManager = this.getFragmentManager();
    android.app.FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
    fragmentTransaction.add(R.id.container, searchFragment, "ViewQueueFragment");
    fragmentTransaction.hide(curFragment);
    fragmentTransaction.commit();
    curFragment = viewQueueFragment;
}