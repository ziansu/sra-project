@java.lang.Override
public boolean execute(edu.umass.cs.gigapaxos.interfaces.Request request) {
    if (request.toString().equals(Request.NO_OP)) {
        return true;
    }
    switch (((edu.umass.cs.reconfiguration.examples.AppRequest.PacketType) (request.getRequestType()))) {
        case DEFAULT_APP_REQUEST :
            return processRequest(((edu.umass.cs.reconfiguration.examples.AppRequest) (request)));
        default :
            break;
    }
    return false;
}