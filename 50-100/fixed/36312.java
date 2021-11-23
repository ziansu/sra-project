@org.springframework.web.bind.annotation.RequestMapping(value = { "/addNode" }, method = org.springframework.web.bind.annotation.RequestMethod.POST)
@org.springframework.security.access.annotation.Secured(value = "ROLE_ADMIN")
@org.springframework.web.bind.annotation.ResponseBody
public ru.obelisk.monitor.graph.Node addNode(@org.springframework.web.bind.annotation.RequestParam
int index, @org.springframework.web.bind.annotation.RequestParam
java.lang.String type) throws java.io.IOException, java.lang.Exception, java.lang.IllegalArgumentException, java.lang.IllegalStateException, org.asteriskjava.manager.AuthenticationFailedException, org.asteriskjava.manager.TimeoutException {
    ru.obelisk.monitor.web.controllers.IvrGraphController.logger.info("Requesting ivr new node info objects");
    ru.obelisk.monitor.graph.Node node = getTypedNode(type);
    node.setIndex(index);
    node.setType(type);
    schemaMap.put(index, node);
    return node;
}