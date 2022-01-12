@java.lang.Override
public void run() {
    while (true) {
        byte[] tmp = new byte[1024];
        try {
            tmp = readFromServer();
            if (tmp != null) {
                Parser.parseData(new java.lang.String(tmp));
            }
            tmp = null;
        } catch (java.io.IOException e1) {
            e1.printStackTrace();
        }
    } 
}