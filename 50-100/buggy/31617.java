public void close() {
    if (mReadOnly) {
        if (((mDatabase) != null) && (!(mDatabase.isOpen())))
            mDatabase.close();
        
        mDatabase = null;
    }else {
        if (!(com.mozzandroidutils.sqlite.MozzDB.isDBClosed()))
            com.mozzandroidutils.sqlite.MozzDB.close();
        
    }
}