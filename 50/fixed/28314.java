private void checkAndAssignSeparator(java.lang.String separator) {
    if ((separator == null) || ((separator = separator.trim()).isEmpty()))
        throw new java.lang.IllegalArgumentException("Separator cannot be null or empty!");
    
    this.separator = separator;
}