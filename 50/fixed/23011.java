public org.opentravel.schemas.node.Node getSubject() {
    if (((tlObj) != null) && ((tlObj.getBusinessObjectRef()) != null))
        subject = this.getNode(tlObj.getBusinessObjectRef().getListeners());
    
    return subject;
}