private void setFragment() {
    fragmentTransaction = fragmentManager.beginTransaction();
    fragmentTransaction.add(R.id.frag_container, allSportsFragment);
    fragmentTransaction.commit();
}