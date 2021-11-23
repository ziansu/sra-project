public static int zmElementLen(com.moilioncircle.redis.replicator.io.RedisInputStream in) throws java.io.IOException {
    int len = in.read();
    if ((len >= 0) && (len <= 253)) {
        return len;
    }else
        if (len == 254) {
            return in.readInt(4, false);
        }else {
            return len;
        }
    
}