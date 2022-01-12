@java.lang.Override
public void accept(java.util.ArrayList<bignews.myapplication.db.Headline> headlines) throws java.lang.Exception {
    android.util.Log.i(bignews.myapplication.db.DAO.TAG, ("doAfterSuccess: " + headlines));
    param.offset += headlines.size();
    android.util.Log.i(bignews.myapplication.db.DAO.TAG, ("doAfterSuccess: " + param));
    android.util.Log.i(bignews.myapplication.db.DAO.TAG, "doAfterSuccess insert into Headline Database begin");
    for (bignews.myapplication.db.Headline headline : headlines)
        headlineDao.addHeadline(headline);
    
    android.util.Log.i(bignews.myapplication.db.DAO.TAG, "doAfterSuccess insert into Headline Database done");
}