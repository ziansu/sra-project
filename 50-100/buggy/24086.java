@java.lang.Override
public boolean equals(java.lang.Object o) {
    if ((this) == o) {
        return true;
    }
    if (!(o instanceof org.apache.poi.ddf.EscherComplexProperty)) {
        return false;
    }
    org.apache.poi.ddf.EscherComplexProperty escherComplexProperty = ((org.apache.poi.ddf.EscherComplexProperty) (o));
    if (!(java.util.Arrays.equals(_complexData, escherComplexProperty._complexData)))
        return false;
    
    return true;
}