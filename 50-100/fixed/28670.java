public void setName(java.lang.String name) {
    this.name = name;
    if ((this.bid) != (-1)) {
        com.irccloud.android.data.collection.BuffersList.getInstance().dirty = true;
        com.raizlabs.android.dbflow.runtime.TransactionManager.getInstance().saveOnSaveQueue(this);
    }
    callbacks.notifyChange(this, BR.name);
}