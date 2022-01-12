@java.lang.Override
public java.lang.Object doInBackground(java.lang.Object[] params) {
    java.lang.String netID = getIntent().getStringExtra("netID");
    java.lang.String password = getIntent().getStringExtra("password");
    edu.byu.dtaylor.homeworknotifier.gsontools.GsonDatabase gsonDb = edu.byu.dtaylor.homeworknotifier.Utils.getAllInfo(this, netID, password);
    if ((gsonDb.getUser()) == null)
        return null;
    
    edu.byu.dtaylor.homeworknotifier.database.DatabaseHelper dbHelper = new edu.byu.dtaylor.homeworknotifier.database.DatabaseHelper(this);
    dbHelper.setDBfromGson(gsonDb);
    return gsonDb;
}