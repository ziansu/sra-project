public java.util.List<java.lang.String> getAllClientId() {
    java.util.List<java.lang.String> result = new java.util.ArrayList<java.lang.String>();
    for (java.util.Map.Entry<io.netty.channel.Channel, com.alibaba.rocketmq.broker.client.ClientChannelInfo> entry : this.channelInfoTable.entrySet()) {
        com.alibaba.rocketmq.broker.client.ClientChannelInfo clientChannelInfo = entry.getValue();
        result.add(clientChannelInfo.getClientId());
    }
    return result;
}