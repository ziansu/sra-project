private boolean checkExpires(cn.edu.sjtu.se.dclab.oss.redis.ClientLastSeenTime client, java.util.Date currentDate) {
    long diff = (currentDate.getTime()) - (client.getDate().getTime());
    return (diff / 1000) >= (cn.edu.sjtu.se.dclab.oss.util.Constants.REDIS_KEY_EXPIRE_TIME);
}