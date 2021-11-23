public void saveToDatabase(java.lang.String name, double distance, double avgSpeed) {
    if (!(mPoints.isEmpty())) {
        setEndPoint();
        ru.sukharev.pathtracker.utils.orm.MapPath mapPath = new ru.sukharev.pathtracker.utils.orm.MapPath(name, mPoints.get(0).getTime(), mPoints.get(((mPoints.size()) - 1)).getTime(), distance, avgSpeed);
        new ru.sukharev.pathtracker.utils.MapHelper.AsynkSaveToDatabaseTask().execute(mapPath);
    }else
        mSQLListener.onFail();
    
}