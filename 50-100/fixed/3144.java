private static java.lang.Boolean convertToBool(java.lang.String tv, java.lang.String fv, java.lang.String input) throws uk.ac.cam.cstibhotel.otcanalyser.networklayer.BooleanFieldFormatException {
    if (input.equals(tv)) {
        return true;
    }else
        if (input.equals(fv)) {
            return false;
        }else
            if (input.equals("")) {
                return null;
            }else
                throw new uk.ac.cam.cstibhotel.otcanalyser.networklayer.BooleanFieldFormatException();
            
        
    
}