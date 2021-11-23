@net.itransformers.ws.connectionDetails.RequestMapping(value = "/{connectionDetailsName}/type", method = RequestMethod.GET)
@net.itransformers.ws.connectionDetails.ResponseBody
java.lang.String createConnectionType(@net.itransformers.ws.connectionDetails.PathVariable
java.lang.String connectionDetailsName) {
    return getConnectionDetailsManager().getConnection(connectionDetailsName).getConnectionType();
}