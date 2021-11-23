public static void checkRowSpecification(java.lang.String rowSpecification) throws org.mm.exceptions.MappingMasterException {
    if ((rowSpecification.length()) == 0)
        throw new org.mm.exceptions.MappingMasterException("empty row specification");
    
    if (!(rowSpecification.equals(MappingExpression.FinishRowOrColumnWildcard))) {
        for (int i = 0; i < (rowSpecification.length()); i++) {
            char c = rowSpecification.charAt(i);
            if (!(org.mm.ss.SpreadSheetUtil.isNumeric(c)))
                throw new org.mm.exceptions.MappingMasterException(("invalid row specification " + rowSpecification));
            
        }
    }
}