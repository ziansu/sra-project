private boolean interestTimestampIsFresh(net.named_data.jndn.Name keyName, double timestamp) {
    java.lang.String keyNameUri = keyName.toUri();
    if (!(keyTimestamps_.containsKey(keyNameUri))) {
        double now = net.named_data.jndn.util.Common.getNowMilliseconds();
        double notBefore = now - (keyGraceInterval_);
        double notAfter = now + (keyGraceInterval_);
        return (timestamp > notBefore) && (timestamp < notAfter);
    }else {
        double lastTimestamp = ((double) (keyTimestamps_.get(keyNameUri)));
        return timestamp > lastTimestamp;
    }
}