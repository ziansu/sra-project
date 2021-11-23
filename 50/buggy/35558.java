@java.lang.Override
public void onCreate() {
    super.onCreate();
    android.util.Log.i(deeplife.gcme.com.deeplife.DeepLife.TAG, "Application Started");
    deeplife.gcme.com.deeplife.DeepLife.mContext = this;
    deeplife.gcme.com.deeplife.DeepLife.myDATABASE = new deeplife.gcme.com.deeplife.Database.Database(this);
    myJobScheduler = me.tatarka.support.job.JobScheduler.getInstance(this);
    JobConstr();
}