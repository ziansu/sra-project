@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    gamercompanion.src.activities.controlling.ActivityController.set_activeContext(this);
    gamercompanion.src.activities.controlling.ActivityController.set_activeActivity(this);
}