@java.lang.Override
public void whileWorking() {
    controller.closeUnusedClients(memberId, 0);
    controller.getState(memberId, false);
    if ((controller.getMemberWorkLoad(memberId)) == 0) {
        nl.zeesoft.zdk.ZStringBuilder response = getTakeOfflineResponse(controller, memberId);
        if ((response == null) || (nl.zeesoft.zjmo.orchestra.ProtocolObject.isResponseJson(response))) {
            controller.getState(memberId, false);
        }
        stop();
    }
}