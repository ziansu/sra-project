public static java.util.Properties concat(java.util.Properties... props) {
    java.util.Properties out = new java.util.Properties();
    for (java.util.Properties prop : props) {
        if (prop != null)
            prop.forEach(out::put);
        
    }
    return out;
}