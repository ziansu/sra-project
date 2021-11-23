private org.apache.tez.runtime.api.LogicalInput createMergedInput(org.apache.tez.dag.api.InputDescriptor inputDesc, org.apache.tez.runtime.api.MergedInputContext mergedInputContext, java.util.List<org.apache.tez.runtime.api.Input> constituentInputs) {
    org.apache.tez.runtime.api.LogicalInput input = org.apache.tez.common.ReflectionUtils.createClazzInstance(inputDesc.getClassName(), new java.lang.Class[]{ org.apache.tez.runtime.api.MergedInputContext.class , java.util.List.class }, new java.lang.Object[]{ mergedInputContext , constituentInputs });
    if (!(input instanceof org.apache.tez.runtime.api.LogicalInput)) {
        throw new org.apache.tez.dag.api.TezUncheckedException((((inputDesc.getClass().getName()) + " is not a sub-type of LogicalInput.") + " Only LogicalInput sub-types supported by LogicalIOProcessor."));
    }
    return input;
}