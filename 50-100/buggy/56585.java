@java.lang.Override
public void run() {
    while (true) {
        java.net.Socket socket;
        mainProcesingUnit.ElevControl elevControl;
        try {
            socket = _carServerSocket.accept();
        } catch (java.io.IOException e) {
            java.lang.System.out.println("an elevator fail to connect");
            continue;
        }
        try {
            elevControl = new mainProcesingUnit.ElevComminication(socket, _protocol);
        } catch (java.lang.Exception e) {
            java.lang.System.out.println("fail to build the elevator handle");
            continue;
        }
        _protocol.addElev(elevControl);
    } 
}