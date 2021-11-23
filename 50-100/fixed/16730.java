private cz.muni.fi.pa165.saes.entity.ActivityRecord createRecord(cz.muni.fi.pa165.saes.entity.User user, cz.muni.fi.pa165.saes.entity.SportActivity activity, java.lang.Long time, java.lang.Integer distance) {
    cz.muni.fi.pa165.saes.entity.ActivityRecord record = new cz.muni.fi.pa165.saes.entity.ActivityRecord();
    record.setActivity(activity);
    record.setDistance(distance);
    record.setTime(time);
    record.setUser(user);
    recordService.create(record);
    return record;
}