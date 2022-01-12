@java.lang.Override
public void reset(org.apache.struts.action.ActionMapping mapping, javax.servlet.http.HttpServletRequest request) {
    org.kuali.kra.protocol.ProtocolFormBase.LOG.debug("reset() ENTER");
    super.reset(mapping, request);
    this.setLookupResultsSequenceNumber(null);
    this.setLookupResultsBOClassName(null);
    onlineReviewsActionHelper.init(true);
    org.kuali.kra.protocol.ProtocolFormBase.LOG.debug("reset() exit..");
}