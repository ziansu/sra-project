public static models.Maintenance saveToDB(models.Vehicle v, java.util.Date d) {
    models.Maintenance mnt = new models.Maintenance(v, d);
    mnt.save();
    return mnt;
}