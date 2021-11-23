@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_detail);
    if (savedInstanceState == null) {
        android.os.Bundle arguments = new android.os.Bundle();
        arguments.putParcelable(DetailActivityFragment.DETAIL_URI, getIntent().getData());
        com.example.julian.sunshine.app.DetailActivityFragment fragment = new com.example.julian.sunshine.app.DetailActivityFragment();
        fragment.setArguments(arguments);
        getSupportFragmentManager().beginTransaction().add(R.id.weather_detail_container, new com.example.julian.sunshine.app.DetailActivityFragment()).commit();
    }
}