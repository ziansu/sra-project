public void run() {
    try {
        while (true) {
            byte[] data = new byte[1024];
            VoiceChatClient.dataInputStream.readFully(data);
            VoiceChatClient.speakers.write(data, 0, 1024);
        } 
    } catch (java.io.IOException e) {
        e.printStackTrace();
    }
}