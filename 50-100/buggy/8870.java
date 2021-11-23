protected void onRetrieveInstanceState(android.os.Bundle savedInstanceState) {
    if (savedInstanceState != null) {
        stats = savedInstanceState.getBundle("champData");
    }else {
        android.os.Bundle extras = getIntent().getExtras();
        isHeader = extras.getBoolean("isHeader");
        stats = extras.getBundle("champData");
    }
}