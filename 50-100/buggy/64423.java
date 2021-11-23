@java.lang.Override
public void attributeOwnershipUnavailable(final hla.rti1516e.ObjectInstanceHandle theObject, final hla.rti1516e.AttributeHandleSet theAttributes) throws hla.rti1516e.exceptions.FederateInternalError {
    this.logger.info(((("attributeOwnershipUnavailable theObject=" + (theObject.toString())) + ", theAttributes=") + (theAttributes.toString())));
    try {
        this.myFederateAmbassador.attributeOwnershipUnavailable(theObject, theAttributes);
    } catch (hla.rti1516e.exceptions.FederateInternalError e) {
        this.logger.info(("attributeOwnershipUnavailable exception=" + (e.getMessage())));
        throw e;
    }
}