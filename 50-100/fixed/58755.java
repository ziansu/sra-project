public void handle(nz.co.fortytwo.signalk.model.SignalKModel node) {
    if ((node.getData().size()) == 0)
        return ;
    
    if (nz.co.fortytwo.signalk.processor.SignalkModelProcessor.logger.isDebugEnabled())
        nz.co.fortytwo.signalk.processor.SignalkModelProcessor.logger.debug(("SignalkModelProcessor  updating " + node));
    
    signalkModel.putAll(node.getData());
    nz.co.fortytwo.signalk.processor.SignalkModelProcessor.logger.debug(signalkModel);
}