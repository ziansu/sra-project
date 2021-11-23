public boolean isAliasInContext(bento.runtime.Context context) {
    if (identity) {
        bento.runtime.Holder holder = null;
        try {
            holder = context.getCachedHolderForDef(this, null, null);
        } catch (bento.lang.Redirection r) {
        }
        if (((holder != null) && ((holder.resolvedInstance) != null)) && (!(this.equals(holder.resolvedInstance.getDefinition())))) {
            return true;
        }
    }
    return isAlias();
}