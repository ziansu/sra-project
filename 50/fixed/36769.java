public void setData(org.greenrobot.greendao.query.LazyList<pl.srw.billcalculator.db.History> data) {
    lazyList = data;
    dataChangeObserver.onChanged(this);
}