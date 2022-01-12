private org.jvoicexml.interpreter.FormItem select(final java.lang.String name) throws org.jvoicexml.event.error.BadFetchError, org.jvoicexml.event.error.SemanticError {
    org.jvoicexml.interpreter.FormInterpretationAlgorithm.LOGGER.info((("selecting next form item in dialog '" + (id)) + "'..."));
    if (name != null) {
        final org.jvoicexml.interpreter.FormItem formItem = getFormItem(name);
        if (formItem == null) {
            throw new org.jvoicexml.event.error.BadFetchError((("unable to find form item '" + name) + "'"));
        }
        return formItem;
    }
    for (org.jvoicexml.interpreter.FormItem formItem : formItems) {
        if (formItem.isSelectable()) {
            return formItem;
        }
    }
    return null;
}