public static void incrementXmlSequence(java.lang.String renderSessionContextUuid) {
    int oldXmlSequence = org.poormanscastle.products.hit2assext.RenderSessionManager.contextMap.get(renderSessionContextUuid).getXmlSequence();
    org.poormanscastle.products.hit2assext.RenderSessionManager.contextMap.get(renderSessionContextUuid).incrementXmlSequence();
    if (org.poormanscastle.products.hit2assext.RenderSessionManager.logger.isInfoEnabled()) {
        int newXmlSequence = org.poormanscastle.products.hit2assext.RenderSessionManager.contextMap.get(renderSessionContextUuid).getXmlSequence();
        org.poormanscastle.products.hit2assext.RenderSessionManager.logger.info(org.apache.commons.lang3.StringUtils.join("Received call: incrementXmlSequence('", renderSessionContextUuid, "') ", oldXmlSequence, "->", newXmlSequence));
    }
}