@java.lang.Override
public java.lang.String toString() {
    if ((count) == 0)
        return "";
    
    if (((count) >= 256) && ((count) <= ((value.length) >> 1)))
        return new java.lang.String(value, 0, count);
    
    shared = true;
    return new java.lang.String(value, 0, count);
}