private void obtainEBooksList() {
    java.util.Collection<com.xsoft.android.ebookreader.domain.entities.EBook> eBookCollection = null;
    try {
        eBookCollection = mRepository.getEBooksCollection();
        if ((eBookCollection.isEmpty()) || (eBookCollection == null))
            notifyConnectionError();
        else
            notifyGetEBooksListOk(eBookCollection);
        
    } catch (com.xsoft.android.ebookreader.repository.exceptions.CacheException e) {
        e.printStackTrace();
    } catch (com.xsoft.android.ebookreader.repository.exceptions.NetworkException e) {
        notifyConnectionError();
    } catch (com.xsoft.android.ebookreader.repository.exceptions.PersistException e) {
        e.printStackTrace();
    }
}