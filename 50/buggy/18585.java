public void addGPSPoint(blau.team.remindme.db.model.GPSPoint point) {
    realm.beginTransaction();
    blau.team.remindme.db.model.GPSPoint realmPoint = realm.copyToRealm(point);
    realm.commitTransaction();
}