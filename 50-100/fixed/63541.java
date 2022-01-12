@java.lang.Override
public void resolveLinks(com.agiletec.plugins.jacms.aps.system.services.dispenser.ContentRenderizationInfo renderizationInfo, com.agiletec.aps.system.RequestContext reqCtx) {
    if (null == renderizationInfo) {
        return ;
    }
    try {
        java.lang.String finalRenderedContent = this.getLinkResolverManager().resolveLinks(renderizationInfo.getCachedRenderedContent(), renderizationInfo.getContentId(), reqCtx);
        renderizationInfo.setRenderedContent(finalRenderedContent);
    } catch (java.lang.Throwable t) {
        com.agiletec.plugins.jacms.aps.system.services.dispenser.BaseContentDispenser._logger.error("Error while resolve links for content {}", renderizationInfo.getContentId(), t);
    }
}