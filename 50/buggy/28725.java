public void refresh() {
    android.util.Log.d("heilige", "scheisse");
    getFragmentManager().beginTransaction().detach(this).attach(this).commit();
}