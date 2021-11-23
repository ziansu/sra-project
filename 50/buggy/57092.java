public int getNotAckedMessageCount(java.util.UUID channelID) {
    return unAckedMsgCountMap.get(channelID).get();
}