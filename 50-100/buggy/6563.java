public boolean equals(com.magnet.mmx.protocol.MMXTopic topic) {
    if (topic == (this))
        return true;
    
    if ((topic == null) || (((mUserId) == null) ^ ((topic.getUserId()) == null)))
        return false;
    
    if (((mUserId) != null) && (!(mUserId.equalsIgnoreCase(topic.getUserId()))))
        return false;
    
    return mTopic.equalsIgnoreCase(topic.getName());
}