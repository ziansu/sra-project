@java.lang.Override
public void onAgentConnect(final io.rocketchat.livechat.model.AgentObject agentObject) {
    chatRoom.getChatHistory(1, lastTimestamp, null, this);
    processAgent(agentObject);
}