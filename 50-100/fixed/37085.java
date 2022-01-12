private void addExpireTime(org.springframework.data.redis.connection.RedisConnection conn, com.github.andyshao.lock.ExpireMode expireMode, int expireTimes) {
    if (expireTimes <= 0)
        return ;
    
    switch (expireMode) {
        case SECONDS :
            conn.expire(this.lockKey, expireTimes);
            break;
        case MILISECONDS :
            conn.pExpire(this.lockKey, expireTimes);
            break;
        default :
            break;
    }
}