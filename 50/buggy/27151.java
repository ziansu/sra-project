@java.lang.Override
public void run() {
    setupStreams();
    tellClientId();
    tellClientRole();
    while (true) {
        if (needsSender) {
            recieveData();
        }
        sendData();
    } 
}