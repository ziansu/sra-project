public java.lang.String toString() {
    java.lang.String result = (((("[c:" + (channel)) + ", v:") + (number)) + ", n:") + (value);
    if ((timestamp) != (-1))
        result += ", ts:" + (timestamp);
    
    if ((bus_name) != null)
        result += ", b:" + (bus_name);
    
    result += "]";
    return result;
}