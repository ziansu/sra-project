public boolean isValid() {
    if (((realm) == null) || (realm.isClosed())) {
        return false;
    }
    return syncToCheckIfValid("Calling isValid on RealmResults whose parent RealmList has been deleted already.");
}