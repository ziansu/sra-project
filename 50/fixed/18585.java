public void addGPSPoint(blau.team.remindme.db.model.GPSPoint point) {
    realm.beginTransaction();
    realm.copyToRealm(point);
    realm.commitTransaction();
}