private com.ksss.splintter.features.group.view.ExpenseManager getCallback() {
    com.ksss.splintter.features.group.view.ExpenseManager callback;
    try {
        callback = ((com.ksss.splintter.features.group.view.ExpenseManager) (getActivity()));
    } catch (java.lang.ClassCastException e) {
        throw new java.lang.IllegalStateException(java.lang.String.format("Container Activity must implement %s", com.ksss.splintter.features.group.view.ExpenseManager.class.getSimpleName()), e);
    }
    return callback;
}