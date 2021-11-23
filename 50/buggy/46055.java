public static void init() {
    org.grapentin.apps.exceer.orm.Database.getInstance();
    if (!(org.grapentin.apps.exceer.orm.Database.getInstance().deferCallback))
        ((org.grapentin.apps.exceer.activity.MainActivity) (org.grapentin.apps.exceer.activity.MainActivity.getInstance())).afterDatabaseInit();
    
}