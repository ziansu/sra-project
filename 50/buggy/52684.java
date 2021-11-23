public final mjson.Json at(java.lang.String property, mjson.Json def) {
    mjson.Json x = at(property);
    if (x == null) {
        set(property, def);
        return def;
    }else
        return x;
    
}