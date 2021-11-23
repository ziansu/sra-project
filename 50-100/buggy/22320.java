void doWriteClass(@org.jetbrains.annotations.Nullable
java.lang.Class val) {
    if (val == null)
        out.writeByte(GridBinaryMarshaller.NULL);
    else {
        org.apache.ignite.internal.binary.BinaryClassDescriptor desc = ctx.descriptorForClass(val, false);
        out.unsafeEnsure((1 + 4));
        out.unsafeWriteByte(GridBinaryMarshaller.CLASS);
        if (desc.registered())
            out.unsafeWriteInt(desc.typeId());
        else {
            out.unsafeWriteInt(GridBinaryMarshaller.UNREGISTERED_TYPE_ID);
            doWriteString(val.getClass().getName());
        }
    }
}