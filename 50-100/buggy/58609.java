public void animateIntent(android.view.View v) {
    android.content.Intent intent;
    intent = new android.content.Intent(this, com.example.kgifaldi.taskstar.ChildMain.class);
    java.lang.String transitionName = getString(R.string.transition_string);
    java.lang.System.out.println("WHAAAAAAAAAAAAAAAAAAAAAAT");
    java.lang.System.out.println(transitionName);
    android.view.View viewStart = findViewById(R.id.info_card);
    android.support.v4.app.ActivityOptionsCompat options = android.support.v4.app.ActivityOptionsCompat.makeSceneTransitionAnimation(this, v, transitionName);
    android.support.v4.app.ActivityCompat.startActivity(this, intent, options.toBundle());
}