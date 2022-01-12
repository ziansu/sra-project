@java.lang.Override
public void populateItem(org.apache.wicket.markup.repeater.Item item, java.lang.String componentId, org.apache.wicket.model.IModel rowModel) {
    com.evolveum.midpoint.xml.ns._public.common.audit_3.AuditEventRecordType auditEventRecordType = ((com.evolveum.midpoint.xml.ns._public.common.audit_3.AuditEventRecordType) (rowModel.getObject()));
    java.lang.String channel = auditEventRecordType.getChannel();
    if (channel != null) {
        javax.xml.namespace.QName channelQName = com.evolveum.midpoint.util.QNameUtil.uriToQName(channel);
        java.lang.String return_ = channelQName.getLocalPart();
        item.add(new org.apache.wicket.markup.html.basic.Label(componentId, return_));
    }
}