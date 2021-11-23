@java.lang.Override
public void run() {
    synchronized(this) {
        while (true) {
            com.Message message = com.Message.recieveMessage(socket);
            if (message.getVerb().equals(Message.SEND)) {
                notify();
            }
            messages.add(message);
            try {
                java.lang.Thread.sleep(500);
            } catch (java.lang.InterruptedException e) {
                e.printStackTrace();
            }
        } 
    }
}