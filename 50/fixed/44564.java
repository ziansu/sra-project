public void writeExternal(java.io.ObjectOutput out) throws java.io.IOException {
    out.write(length, 0, length.length);
    out.write(type);
    if ((payload) != null)
        out.write(payload, 0, payload.length);
    
}