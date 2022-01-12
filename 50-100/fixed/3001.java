public void actionPerformed(java.awt.event.ActionEvent e) {
    if ((yourAccount) != null) {
        video.VideoCall videoCall = new video.VideoCall(yourAccount.getName(), yourAccount.getMyIP());
        videoCall.startRecorderVideo();
        videoCall.startPlayerVideo();
        try {
            client.Client.dout.writeUTF((((((myAccount.getName()) + "-") + (yourAccount.getName())) + "-") + (config.Config.tokenVideoCall)));
        } catch (java.io.IOException e1) {
        }
    }
}