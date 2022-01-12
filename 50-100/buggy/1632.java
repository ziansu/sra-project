public final uk.chromis.pos.forms.ProductInfoExt getProductInfoByCode(java.lang.String sCode) throws uk.chromis.basic.BasicException {
    if (sCode.startsWith("977")) {
        sCode = sCode.substring(0, 10);
    }
    return ((uk.chromis.pos.forms.ProductInfoExt) (new uk.chromis.pos.forms.PreparedSentence(s, ((("SELECT " + (getSelectFieldList())) + "FROM STOCKCURRENT C RIGHT JOIN PRODUCTS P ON (C.PRODUCT = P.ID) ") + " WHERE CODE = ? "), SerializerWriteString.INSTANCE, uk.chromis.pos.forms.ProductInfoExt.getSerializerRead()).find(sCode)));
}