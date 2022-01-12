public com.intel.vmf.Metadata getElement(long number) {
    if (number >= 0)
        return new com.intel.vmf.Metadata(com.intel.vmf.MetadataSet.n_getElement(nativeObj, number));
    else
        return null;
    
}