public static void zoom(final java.lang.String TableName, final int Record_ID, final int AD_Window_ID, final int PO_Window_ID) {
    if ((TableName == null) || (AD_Window_ID <= 0)) {
        return ;
    }
    org.compiere.apps.AEnv.zoom(org.adempiere.model.RecordZoomWindowFinder.newInstance(TableName, Record_ID).setSO_Window_ID(AD_Window_ID).setPO_Window_ID(PO_Window_ID));
}