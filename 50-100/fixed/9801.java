@java.lang.Override
public void run() {
    while (!(finished)) {
        try {
            java.lang.Object response = inputStream.readObject();
            java.lang.System.out.println("Response recieved ");
            if (isUpdate(((rpcprotocol.Response) (response)))) {
            }else {
                try {
                    queueResponses.put(((rpcprotocol.Response) (response)));
                } catch (java.lang.InterruptedException e) {
                    e.printStackTrace();
                }
            }
        } catch (java.io.IOException | java.lang.ClassNotFoundException ex) {
            java.lang.System.out.println("Client reader stopped");
            finished = true;
        }
    } 
}