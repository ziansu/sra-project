@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    android.widget.ImageButton favButton = ((android.widget.ImageButton) (findViewById(R.id.favoriteButton)));
    favButton.setOnClickListener(this);
    android.widget.ImageButton mapButton = ((android.widget.ImageButton) (findViewById(R.id.mapsbutton)));
    mapButton.setOnClickListener(this);
}