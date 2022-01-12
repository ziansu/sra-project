@java.lang.Override
protected void onCreate(@android.support.annotation.Nullable
android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    showNavigationFab = ((android.support.design.widget.FloatingActionButton) (findViewById(R.id.show_navigation_fab)));
    navigationView = ((android.support.design.widget.BottomNavigationView) (findViewById(R.id.bottom_navigation_view)));
    navigationView.setOnNavigationItemSelectedListener(this);
    showNavigationFab.setOnClickListener(this);
    setTransition();
}