@java.lang.Override
public void run() {
    try {
        this.communicationSocket = this.initiateCommunicationSocket();
    } catch (backend.exceptions.ServerException e) {
        this.actController.handleException(e);
    }
    try {
        this.listen();
    } catch (backend.exceptions.ConnectionIssueException | backend.exceptions.ServerException e) {
        this.actController.handleException(e);
    }
    this.finalize();
}