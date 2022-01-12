@java.lang.Override
public void run() {
    QA qa = null;
    try {
        java.io.ObjectInputStream inputStream = new java.io.ObjectInputStream(clientSocket.getInputStream());
        while (true) {
            qa = ((QA) (inputStream.readObject()));
            queue.put(qa);
            if ((qa.getQuestion()) == null)
                break;
            
        } 
        inputStream.close();
    } catch (java.lang.Exception e) {
        e.printStackTrace();
    }
    java.lang.System.out.println("ServerQAReceiver terminated");
}