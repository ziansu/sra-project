public static void setHolder(final com.oracle.truffle.api.object.DynamicObject invokable, final com.oracle.truffle.api.object.DynamicObject value) {
    if (som.vmobjects.SInvokable.SMethod.isSMethod(invokable)) {
        som.vmobjects.SInvokable.SMethod.setHolder(invokable, value);
    }else {
        InvokableLayoutImpl.INSTANCE.setHolderUnsafe(invokable, value);
    }
}