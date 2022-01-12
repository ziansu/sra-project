public void setParameter(org.compiere.process.ProcessInfoParameter[] parameters) {
    if (parameters == null) {
        this.parameters = null;
        return ;
    }
    this.parameters = new java.util.Hashtable<java.lang.String, org.compiere.process.ProcessInfoParameter>();
    for (org.compiere.process.ProcessInfoParameter parameter : parameters) {
        if ((parameter.getParameterName()) == null)
            continue;
        
        this.parameters.put(parameter.getParameterName(), parameter);
    }
}