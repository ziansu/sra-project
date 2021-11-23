@java.lang.Override
public boolean add(toberumono.namelist.parser.NamelistValue<T> value) {
    java.lang.String v = value.type().stringValue(value.value());
    if ((v.length()) > (valueWidth))
        valueWidth = v.length();
    
    return super.add(value);
}