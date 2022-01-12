private void init() {
    skittleContainer = ((android.widget.LinearLayout) (android.view.LayoutInflater.from(getContext()).inflate(R.layout.skittle_container, this, false)));
    addView(skittleContainer);
    skittleMain = ((android.support.design.widget.FloatingActionButton) (findViewById(R.id.skittle_main)));
    skittleMain.setOnClickListener(this);
}