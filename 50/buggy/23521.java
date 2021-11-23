@java.lang.Override
public void onClick(android.view.View view) {
    android.util.Log.d("debug", "quicklistener");
    attemptLogin();
    android.content.Intent myIntent = new android.content.Intent(this, app.com.example.shaunchua.sentientemr.NavigationActivity.class);
    this.startActivity(myIntent);
}