@java.lang.Override
public java.lang.StringBuffer format(java.lang.Object object, java.lang.StringBuffer buffer, java.text.FieldPosition field) {
    int day = (((java.lang.Number) (object)).intValue()) % (maxExer.size());
    if ((day > (-1)) && (day < (maxExer.size())))
        buffer.append(maxExer.get(day));
    
    return buffer;
}