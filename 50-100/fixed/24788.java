public java.lang.String getDescription() {
    if ((getFirstReferredColumn()) != null) {
        if (!(org.dbflute.erflute.core.util.Check.isEmpty(foreignKeyDescription))) {
            return foreignKeyDescription;
        }else {
            return getFirstReferredColumn().getDescription();
        }
    }
    return word.getDescription();
}