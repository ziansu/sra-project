@java.lang.SuppressWarnings(value = "unused")
public static java.lang.invoke.CallSite bsm_inlinedBackCall(java.lang.invoke.MethodHandles.Lookup lookup, java.lang.String methodName, java.lang.invoke.MethodType type) throws java.lang.Throwable {
    java.lang.invoke.MethodHandle mh = lookup.findStatic(rt.RT.class, "invokeInlinedCall", rt.RT.TYPE_INVOKE_INLINED_CALL);
    mh = mh.bindTo(lookup).bindTo(methodName).bindTo(type);
    return new java.lang.invoke.ConstantCallSite(rt.RT.invokerOf(type.dropParameterTypes(0, 1), mh).asType(type));
}