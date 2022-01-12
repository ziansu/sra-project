private void repoll() {
    com.spiddekauga.http.HttpGetBuilder getBuilder = getBindUrl(true);
    getBuilder.addParameter("CI", "0");
    getBuilder.addParameter("AID", mMessageId);
    getBuilder.addParameter("TYPE", "xmlhttp");
    try {
        mConnection = getBuilder.build();
        mParser = new edu.gvsu.cis.masl.channelAPI.TalkMessageParser(mConnection);
    } catch (java.io.IOException | edu.gvsu.cis.masl.channelAPI.ChannelAPI.ChannelException e) {
    }
}