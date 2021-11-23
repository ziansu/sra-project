private boolean checkExpires(java.util.Date date, java.util.Date currentDate) {
    long diff = (currentDate.getTime()) - (date.getTime());
    return (diff / 1000) >= (cn.edu.sjtu.se.dclab.oss.util.Constants.REDIS_KEY_EXPIRE_TIME);
}