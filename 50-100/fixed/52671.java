public void write(java.io.DataOutputStream out, int value) throws java.io.IOException {
    switch (this) {
        case INT8 :
            out.writeByte(value);
            break;
        case INT16 :
            out.writeShort(value);
            break;
        case INT32 :
            out.writeInt(value);
            break;
        default :
            throw new java.lang.RuntimeException(("Unknown itype: " + (this)));
    }
}