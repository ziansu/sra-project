@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_configuration);
    java.lang.String tmp = com.example.gleb.first.cache.Cacher.readConfig(MainActivity.FOLDER_CONFIG, MainActivity.CONFIG_NOTIFICATION_STATE);
    if (tmp == null)
        notificationState = true;
    else
        notificationState = java.lang.Boolean.parseBoolean(tmp);
    
    toReturn = new android.os.Bundle();
    listView = ((android.widget.ListView) (findViewById(R.id.configurationList)));
}