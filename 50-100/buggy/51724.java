private short nextParamStackPos(int size) {
    short pos = ((short) (((parameterStackSpace) + (org.jikesrvm.compilers.baseline.arm.BaselineCompilerImpl.MAX_REGISTER_LOC)) + (org.jikesrvm.SizeConstants.BYTES_IN_INT)));
    if (org.jikesrvm.VM.VerifyAssertions)
        org.jikesrvm.VM._assert(((parameterStackSpace) <= ((java.lang.Short.MAX_VALUE) - size)));
    
    parameterStackSpace += size;
    return pos;
}