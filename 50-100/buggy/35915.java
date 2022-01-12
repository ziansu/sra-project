@java.lang.Override
public java.lang.String toString() {
    java.lang.StringBuilder s = new java.lang.StringBuilder();
    s.append("Destination[").append(provider);
    s.append(java.lang.String.format(" %.6f,%.6f", latitude, longitude));
    if (hasRadius)
        s.append(" radius=").append(radius);
    
    s.append("]");
    return s.toString();
}