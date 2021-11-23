@java.lang.Override
public void onCreate() {
    com.orm.SugarContext.init(this);
    com.facebook.FacebookSdk.sdkInitialize(getApplicationContext());
    com.facebook.appevents.AppEventsLogger.activateApp(this);
    super.onCreate();
    com.squareup.picasso.Picasso.Builder builder = new com.squareup.picasso.Picasso.Builder(this);
    com.squareup.picasso.Picasso picasso = builder.build();
    picasso.setIndicatorsEnabled(true);
    picasso.setLoggingEnabled(false);
    com.squareup.picasso.Picasso.setSingletonInstance(picasso);
}