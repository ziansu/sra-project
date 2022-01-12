@java.lang.Override
public void run() {
    QA current = null;
    java.io.ObjectOutputStream outputStream = null;
    try {
        outputStream = new java.io.ObjectOutputStream(socket.getOutputStream());
        while (true) {
            current = queue.take();
            outputStream.writeObject(current);
            if ((current.getQuestion()) == null)
                break;
            
        } 
    } catch (java.lang.Exception e) {
        e.printStackTrace();
    }
    java.lang.System.out.println("ClientQASender terminated");
}