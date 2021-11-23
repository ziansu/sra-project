@javax.annotation.PostConstruct
public void initMap() {
    org.springframework.util.Assert.notEmpty(channels);
    for (java.lang.String value : channels) {
        java.lang.String[] v = value.split("-");
        channelMap.put(v[0], java.lang.Integer.valueOf(v[1]));
    }
    subChannelMap.put(com.city.beijing.config.properties.processConfig.ElementSubChannel.ANDROID_SUBCHANNEL, androidSubChanenl);
    subChannelMap.put(com.city.beijing.config.properties.processConfig.ElementSubChannel.IOS_SUBCHANNEL, iosSubChannel);
    subChannelMap.put(com.city.beijing.config.properties.processConfig.ElementSubChannel.WECHAT_SUBCHANNEL, wechatSubChannel);
}