@org.springframework.scheduling.annotation.Scheduled(initialDelay = 1000000, fixedDelay = 1000000)
public boolean removeUsers() {
    for (java.util.Iterator<java.lang.String> iterator = userOpenIdChannelMap.keySet().iterator(); iterator.hasNext();) {
        java.lang.String openId = iterator.next();
        if (!(userOpenIdChannelMap.get(openId).isActive())) {
            iterator.remove();
            weixinUserMap.get(openId).setOverdue(true);
            weixinUserMap.remove(openId);
        }
    }
    return true;
}