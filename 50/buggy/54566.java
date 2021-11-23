private com.google.gson.JsonElement invokeOperationAction(java.lang.String switchName, java.lang.String operation, net.saowoba.backstreettoy.switches.annotation.dataobject.StringParameters simpliedParams) {
    return net.saowoba.backstreettoy.switches.controller.SwitchController.innerOperationActions.get(switchName).act(switchName, operation, simpliedParams);
}