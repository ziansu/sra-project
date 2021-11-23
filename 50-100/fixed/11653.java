public final void updateIncompatibleList(final domain.ContractOption option, final java.util.List<domain.ContractOption> newIncOptions) {
    java.util.Set<domain.ContractOption> currentIncOptions = option.getIncompatibleOptions();
    java.util.Set<domain.ContractOption> removingOptions = new java.util.HashSet(currentIncOptions);
    removingOptions.removeAll(newIncOptions);
    java.util.Set<domain.ContractOption> newOptions = new java.util.HashSet(newIncOptions);
    newOptions.removeAll(currentIncOptions);
    for (domain.ContractOption removingOption : removingOptions) {
        deleteIncompatibleOptions(option, removingOption);
    }
    for (domain.ContractOption newOption : newOptions) {
        addIncompatibleOptions(option, newOption);
    }
}