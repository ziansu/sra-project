public static com.emarte.regurgitator.extensions.web.Message applyGlobalData(com.emarte.regurgitator.extensions.web.Message message) throws com.emarte.regurgitator.extensions.web.RegurgitatorException {
    com.emarte.regurgitator.extensions.web.Parameters context = message.getContext(com.emarte.regurgitator.extensions.web.ExtensionsWebConfigConstants.GLOBAL_METADATA_CONTEXT);
    if ((context.size()) > 0) {
        com.emarte.regurgitator.extensions.web.HttpGlobalUtil.log.debug("Adding global parameters to message");
        for (java.lang.Object id : com.emarte.regurgitator.extensions.web.HttpGlobalUtil.GLOBAL_PARAMETERS.keySet()) {
            context.setValue(com.emarte.regurgitator.extensions.web.HttpGlobalUtil.GLOBAL_PARAMETERS.get(id));
        }
    }
    return message;
}