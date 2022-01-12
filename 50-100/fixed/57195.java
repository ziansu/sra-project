@java.lang.Override
public void setProperties(java.util.Properties p) throws java.lang.Exception {
    checkRequiredProperties(new java.lang.String[]{  }, p);
    worklistId = ((p.getProperty("worklistId")) == null) ? null : java.lang.Long.valueOf(p.getProperty("worklistId"));
    checklistId = ((p.getProperty("checklistId")) == null) ? null : java.lang.Long.valueOf(p.getProperty("checklistId"));
}