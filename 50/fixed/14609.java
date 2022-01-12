@java.lang.Override
public java.lang.Integer marshal(java.lang.Integer v) throws java.lang.Exception {
    if (v != null) {
        counter = v;
        return v;
    }
    return (counter)++;
}