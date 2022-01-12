@java.lang.Override
public void setProperties(java.util.Properties p) throws java.lang.Exception {
    checkRequiredProperties(new java.lang.String[]{  }, p);
    worklistId = java.lang.Long.valueOf(p.getProperty("worklistId"));
    checklistId = java.lang.Long.valueOf(p.getProperty("checklistId"));
}