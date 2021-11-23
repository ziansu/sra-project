public void setData(org.greenrobot.greendao.query.LazyList<pl.srw.billcalculator.db.History> data) {
    if ((lazyList) != null)
        lazyList.close();
    
    lazyList = data;
    dataChangeObserver.onChanged(this);
}