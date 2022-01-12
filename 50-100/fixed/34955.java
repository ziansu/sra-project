public void sendSources(java.util.Set<ru.spbau.mit.ClientInfo> clientInfos) throws java.io.IOException {
    out.writeInt(clientInfos.size());
    out.flush();
    for (ru.spbau.mit.ClientInfo clientInfo : clientInfos) {
        out.write(clientInfo.getServerIP());
        out.writeInt(clientInfo.getServerPort());
    }
    out.flush();
}