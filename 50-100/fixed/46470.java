public static boolean validirajCijenu(java.lang.String cijena) throws Exceptions.WrongInputException {
    if (cijena == "")
        return true;
    
    try {
        java.lang.Double.parseDouble(cijena);
    } catch (java.lang.NumberFormatException e) {
        ba.unsa.etf.si.app.SIDEVS.Validation.Validator.logger.error(e);
        throw new Exceptions.WrongInputException("Cijena nije u ispravnom formatu");
    }
    return true;
}