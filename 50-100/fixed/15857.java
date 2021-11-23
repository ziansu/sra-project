@java.lang.Override
public java.lang.String toString() {
    if (isReg)
        return (((isImm ? "[" : "") + (reg)) + ((offset) != 0 ? ", #" + (offset) : "")) + (isImm ? "]" : "");
    
    if (isInt)
        return "=" + (i);
    
    if (isStr)
        return "=" + (s);
    
    return null;
}