public int getRowsToPreview() {
    if (((getProperties()) != null) && ((getProperties().size()) > 0)) {
        java.lang.String rows = ((java.lang.String) (getProperties().get(com.ss.speedtransfer.model.QueryDefinition.ROWS_TO_PREVIEW)));
        if ((rows == null) || ((rows.trim().length()) == 0))
            return com.ss.speedtransfer.model.QueryDefinition.DEFAULT_ROWS_TO_PREVIEW;
        
        try {
            return java.lang.Integer.parseInt(rows);
        } catch (java.lang.NumberFormatException e) {
        }
    }
    return com.ss.speedtransfer.model.QueryDefinition.DEFAULT_ROWS_TO_PREVIEW;
}