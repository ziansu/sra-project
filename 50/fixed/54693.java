@net.itransformers.ws.connectionDetails.RequestMapping(value = "/", method = RequestMethod.POST)
@net.itransformers.ws.connectionDetails.ResponseBody
public void createConnection(@net.itransformers.ws.connectionDetails.RequestBody
java.lang.String name) {
    getConnectionDetailsManager().createConnection(name, null);
}