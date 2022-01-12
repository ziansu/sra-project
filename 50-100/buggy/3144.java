private static java.lang.Boolean convertToBool(java.lang.String tv, java.lang.String fv, java.lang.String input) throws uk.ac.cam.cstibhotel.otcanalyser.networklayer.BooleanFieldFormatException {
    if (input == tv) {
        return true;
    }else
        if (input == fv) {
            return false;
        }else
            if (input == "") {
                return null;
            }else
                throw new uk.ac.cam.cstibhotel.otcanalyser.networklayer.BooleanFieldFormatException();
            
        
    
}