@java.lang.Override
public void validateGlobalConfig(java.lang.String category, java.lang.String name, java.lang.String oldValue, java.lang.String value) throws org.zstack.core.config.GlobalConfigException {
    java.lang.Long valueLong = org.zstack.utils.SizeUtils.sizeStringToBytes(value);
    java.lang.Long _1tToBytes = org.zstack.utils.SizeUtils.sizeStringToBytes("1T");
    if ((valueLong > _1tToBytes) || (valueLong < 0)) {
        throw new org.zstack.core.config.GlobalConfigException(java.lang.String.format(("Value %s  cannot be greater than the 1TB" + " but got %s"), KVMGlobalConfig.RESERVED_MEMORY_CAPACITY.getCanonicalName(), value));
    }
}