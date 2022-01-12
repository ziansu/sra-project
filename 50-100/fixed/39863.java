@java.lang.Override
public void run() {
    try {
        this.communicationSocket = this.initiateCommunicationSocket();
    } catch (backend.exceptions.ServerException e) {
        this.actController.handleException(e);
    }
    try {
        this.listen();
    } catch (backend.exceptions.ConnectionIssueException e) {
        this.actController.handleException(e);
    } catch (backend.exceptions.ServerException e) {
        this.actController.handleException(e);
    }
    this.finalize();
}