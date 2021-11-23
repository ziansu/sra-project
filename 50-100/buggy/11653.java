public final void updateIncompatibleList(final domain.ContractOption option, final java.util.List<domain.ContractOption> newIncOptions) {
    java.util.List<domain.ContractOption> currentIncOptions = option.getIncompatibleOptions();
    java.util.List<domain.ContractOption> removingOptions = new java.util.ArrayList(currentIncOptions);
    removingOptions.removeAll(newIncOptions);
    java.util.List<domain.ContractOption> newOptions = new java.util.ArrayList(newIncOptions);
    newOptions.removeAll(currentIncOptions);
    for (domain.ContractOption removingOption : removingOptions) {
        deleteIncompatibleOptions(option, removingOption);
    }
    for (domain.ContractOption newOption : newIncOptions) {
        addIncompatibleOptions(option, newOption);
    }
}