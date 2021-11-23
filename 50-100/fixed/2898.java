public static com.bitdubai.fermat_cer_api.all_definition.enums.TimeUnit getByCode(java.lang.String code) throws com.bitdubai.fermat_api.layer.all_definition.exceptions.InvalidParameterException {
    switch (code) {
        case "DY" :
            return com.bitdubai.fermat_cer_api.all_definition.enums.TimeUnit.DAY;
        case "WK" :
            return com.bitdubai.fermat_cer_api.all_definition.enums.TimeUnit.WEEK;
        case "MT" :
            return com.bitdubai.fermat_cer_api.all_definition.enums.TimeUnit.MONTH;
        case "YR" :
            return com.bitdubai.fermat_cer_api.all_definition.enums.TimeUnit.YEAR;
        default :
            throw new com.bitdubai.fermat_api.layer.all_definition.exceptions.InvalidParameterException(com.bitdubai.fermat_api.layer.all_definition.exceptions.InvalidParameterException.DEFAULT_MESSAGE, null, ("Code Received: " + code), "This Code Is Not Valid for the TimeUnit enum");
    }
}