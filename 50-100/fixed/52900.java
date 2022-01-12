private void sendToGroup(java.lang.String groupId, com.sumory.gru.spear.message.BaseMessage msg) {
    com.sumory.gru.spear.transport.inner.InnerReceiver.logger.info("开始群发, groupId:{} msgId:{}", groupId, msg.getId());
    if (groupId != null) {
        com.sumory.gru.spear.domain.Group group = this.groupMap.get(groupId);
        if (group != null)
            synchronized(group) {
                group.broadcast("msg", msg);
            }
        
    }
}