public void loadItems() {
    if (!(database.getRunningTask())) {
        android.util.Log.d(es.ulpgc.eite.clean.mvp.sample.listSubjects.TAG, "calling onLoadItemsSubjectsFinished() method");
    }else {
        android.util.Log.d(es.ulpgc.eite.clean.mvp.sample.listSubjects.TAG, "calling onLoadItemsSubjectStarted() method");
        onLoadItemsSubjectStarted();
    }
}