public void setMessageProperties(final java.util.Collection<org.holodeckb2b.interfaces.general.IProperty> msgProps) {
    if (!(org.holodeckb2b.common.util.Utils.isNullOrEmpty(msgProps))) {
        this.msgProperties = new java.util.ArrayList(msgProps.size());
        for (final org.holodeckb2b.interfaces.general.IProperty p : msgProps)
            this.msgProperties.add(new org.holodeckb2b.common.messagemodel.Property(p));
        
    }else
        this.msgProperties = null;
    
}