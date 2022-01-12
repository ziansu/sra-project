private java.lang.String executeCommand(client.ChatserverCommand c) {
    try {
        channel.write(c);
        model.responses.ServerResponse response = smr.waitForServerResponse();
        return response.getMessage();
    } catch (client.ChannelException e) {
        return "Network error: " + (e.getMessage());
    } catch (java.lang.InterruptedException e) {
        return "No response was sent for that command";
    } catch (java.io.IOException e) {
        e.printStackTrace();
    }
    return null;
}