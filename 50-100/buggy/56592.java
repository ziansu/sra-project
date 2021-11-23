@java.lang.Override
public boolean equals(java.lang.Object o) {
    if ((this) == o)
        return true;
    
    if ((o == null) || ((getClass()) != (o.getClass())))
        return false;
    
    com.alphatica.genotick.data.DataSetName that = ((com.alphatica.genotick.data.DataSetName) (o));
    return name.equals(that.name);
}