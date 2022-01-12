public void setMessageProperties(final java.util.Collection<org.holodeckb2b.interfaces.general.IProperty> msgProps) {
    this.msgProperties = new java.util.ArrayList((msgProps != null ? msgProps.size() : 0));
    if (!(org.holodeckb2b.common.util.Utils.isNullOrEmpty(msgProps))) {
        for (final org.holodeckb2b.interfaces.general.IProperty p : msgProps)
            this.msgProperties.add(new org.holodeckb2b.common.messagemodel.Property(p));
        
    }
}