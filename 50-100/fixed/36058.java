private org.apache.tez.runtime.api.LogicalInput createMergedInput(org.apache.tez.dag.api.InputDescriptor inputDesc, org.apache.tez.runtime.api.MergedInputContext mergedInputContext, java.util.List<org.apache.tez.runtime.api.Input> constituentInputs) {
    org.apache.tez.runtime.api.LogicalInput input = org.apache.tez.common.ReflectionUtils.createClazzInstance(inputDesc.getClassName(), new java.lang.Class[]{ org.apache.tez.runtime.api.MergedInputContext.class , java.util.List.class }, new java.lang.Object[]{ mergedInputContext , constituentInputs });
    return input;
}