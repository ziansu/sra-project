public void set(java.lang.Object value, java.lang.String... indices) {
    if ((indices.length) == 0) {
        set(value.toString());
    }else
        if ((indices.length) == 1) {
            set(value.toString(), indices[0]);
        }else {
            set(value.toString(), indices[0], java.util.Arrays.copyOfRange(indices, 1, indices.length));
        }
    
}