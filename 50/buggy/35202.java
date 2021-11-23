@java.lang.Override
public void setPayload(java.lang.Object payload, org.mule.api.transformer.DataType<?> dataType) {
    if (payload == null) {
        setValue(org.mule.transport.NullPayload.getInstance());
    }else {
        setValue(payload);
    }
    setDataType(dataType.cloneDataType());
}