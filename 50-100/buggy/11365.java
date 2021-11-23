public void createLocalServer(java.lang.String port) {
    int iport = -1;
    try {
        iport = java.lang.Integer.parseInt(port);
        localServer = server.ServerFactory.createServer(iport);
        localServer.startUp();
        this.connect("localhost", ("" + port));
    } catch (java.lang.NumberFormatException nfe) {
        showFail(loginScreen, "Please insert a real number at the Port-Field.");
    } catch (java.net.BindException e) {
        showFail(loginScreen, "Port is already in use, please enter another Port.");
    } catch (java.net.BindException e) {
        showFail(loginScreen, "The specified port is already in use. Please choose another port.");
    }
}