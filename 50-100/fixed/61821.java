@java.lang.SuppressWarnings(value = "unchecked")
@java.lang.Override
public java.lang.String convertObjectToString(java.lang.Object object, boolean appendInnerParenthesis) {
    if ((typeConverter) != null) {
        java.lang.Object converted = (convertToDB) ? typeConverter.getDBValue(object) : object;
        return com.raizlabs.android.dbflow.sql.language.BaseCondition.convertValueToString(converted, appendInnerParenthesis, false);
    }else {
        return super.convertObjectToString(object, appendInnerParenthesis);
    }
}