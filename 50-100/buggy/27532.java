public void run() {
    try {
        while (true) {
            int length = VoiceChatClient.dataInputStream.available();
            byte[] data = new byte[length];
            VoiceChatClient.dataInputStream.readFully(data);
            VoiceChatClient.speakers.write(data, 0, 1024);
        } 
    } catch (java.io.IOException e) {
        e.printStackTrace();
    }
}