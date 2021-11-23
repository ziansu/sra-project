@java.lang.Override
public java.lang.String stringValueOf(org.apache.poi.ss.usermodel.Cell cell) {
    java.lang.Double value = getValue(cell);
    if ((value == (java.lang.Math.floor(value))) && (!(java.lang.Double.isInfinite(value)))) {
        java.lang.Long longVal = value.longValue();
        return longVal.toString();
    }else
        return null;
    
}