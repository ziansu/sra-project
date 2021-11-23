@java.lang.Override
public void run() {
    setupStreams();
    tellClientId();
    while (true) {
        tellClientRole();
        if (connectedToSender) {
            recieveData();
        }else {
            sendData();
        }
    } 
}