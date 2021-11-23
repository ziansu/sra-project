@java.lang.Override
public boolean equals(java.lang.Object o) {
    if ((this) == o)
        return true;
    
    if ((o == null) || ((getClass()) != (o.getClass())))
        return false;
    
    com.wijdemans.ValueType<?> valueType = ((com.wijdemans.ValueType<?>) (o));
    return value.equals(valueType.value);
}