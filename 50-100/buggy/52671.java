public void write(java.io.DataOutputStream out, int value) throws java.io.IOException {
    switch (this) {
        case INT8 :
            out.writeByte(value);
        case INT16 :
            out.writeShort(value);
        case INT32 :
            out.writeInt(value);
        default :
            throw new java.lang.RuntimeException(("Unknown itype: " + (this)));
    }
}