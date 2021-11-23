public void updateNotification(monakhv.samlib.db.entity.Author author) {
    if ((mProgressNotification) == null) {
        return ;
    }
    mProgressNotification.update(author);
}