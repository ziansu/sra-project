@java.lang.Override
public void set(org.dashbuilder.dataset.def.DataSetDef dataSetDef) {
    super.set(dataSetDef);
    org.dashbuilder.dataset.def.SQLDataSetDef sqlDef = getDataSetDef();
    if (sqlDef != null) {
        if ((sqlDef.getDbTable()) != null)
            enableTable();
        else
            enableQuery();
        
    }
}