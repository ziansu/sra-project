private void showMainFragment() {
    android.view.ViewGroup container = ((android.view.ViewGroup) (findViewById(R.id.container)));
    container.removeAllViews();
    container.addView(getLayoutInflater().inflate(R.layout.fragment_main, null));
    container.findViewById(R.id.btnNext).setOnClickListener(this);
}