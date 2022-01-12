public void deleteFirstXDevotionals(int number) {
    realm.beginTransaction();
    io.realm.RealmResults<church.lifejourney.bestillknow.db.Devotional> devotionals = realm.where(church.lifejourney.bestillknow.db.Devotional.class).findAllSorted("pubDate", Sort.DESCENDING);
    if ((devotionals.size()) >= number) {
        for (int i = 0; i < number; i++) {
            devotionals.first().removeFromRealm();
        }
    }
    realm.commitTransaction();
    church.lifejourney.bestillknow.helper.Logger.debug(this, java.lang.String.format("Removed first %s devotionals", number));
}