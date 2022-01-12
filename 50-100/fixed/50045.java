@org.vmmagic.pragma.Uninterruptible
void recordSavedRegisterLocations(org.vmmagic.unboxed.AddressArray registerLocations, org.vmmagic.unboxed.Address framePtr) {
    if (org.jikesrvm.VM.VerifyAssertions)
        org.jikesrvm.VM._assert((!(((org.jikesrvm.classloader.NormalMethod) (getMethod())).getDeclaringClass().hasDynamicBridgeAnnotation())));
    
    org.vmmagic.unboxed.Address addr = framePtr.plus(org.jikesrvm.arm.StackframeLayoutConstants.STACKFRAME_SAVED_REGISTER_OFFSET);
    for (int i = (nextGPR) - 1; i >= (org.jikesrvm.arm.RegisterConstants.FIRST_LOCAL_GPR.value()); i--) {
        addr = addr.minus(org.jikesrvm.runtime.UnboxedSizeConstants.BYTES_IN_ADDRESS);
        registerLocations.set(i, addr);
    }
}