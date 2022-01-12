public IntermediateCode searchCode(java.lang.String eval) {
    java.lang.System.out.println(("TablaCödigo: " + (tableCodes)));
    for (IntermediateCode ic : tableCodes) {
        java.lang.String label = ic.getLabel().substring(0, ic.getLabel().indexOf("_"));
        if (label.equals(eval)) {
            return ic;
        }
    }
    return null;
}