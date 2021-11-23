public void buttonOnClickHelpScreen1(android.view.View view) {
    android.content.Intent iphoneDesignActivityIntent = new android.content.Intent(this, com.example.meghanchua.remoteapp.IphoneHelpScreen.class);
    iphoneDesignActivityIntent.putExtra("user", user);
    this.startActivity(iphoneDesignActivityIntent);
}