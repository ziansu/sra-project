private static void setPrevInsertion(org.zkoss.zk.ui.Component target, org.zkoss.zk.ui.Component prevInsertion) {
    if (target == prevInsertion)
        return ;
    
    if (target instanceof org.zkoss.zk.ui.HtmlShadowElement) {
        org.zkoss.zk.ui.HtmlShadowElement.asShadow(target)._previousInsertion = prevInsertion;
    }
    if (prevInsertion instanceof org.zkoss.zk.ui.HtmlShadowElement) {
        org.zkoss.zk.ui.HtmlShadowElement.asShadow(prevInsertion)._nextInsertion = target;
    }
}