@java.lang.Override
public float getValue(io.brothers.sgm.User.SGMUser user) {
    long dateInstallation = ((int) (io.brothers.sgm.SGMStatManager.getInstance().getStatValueForUser(user, EData.STATS_DATE_INSTALLATION.toString())));
    return dateInstallation - (dateToLong(now()));
}