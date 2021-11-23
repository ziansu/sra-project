public java.lang.String getDescription() {
    if ((this.getFirstReferredColumn()) != null) {
        if (!(org.dbflute.erflute.core.util.Check.isEmpty(this.foreignKeyDescription))) {
            return this.foreignKeyDescription;
        }else {
            return this.getFirstReferredColumn().getDescription();
        }
    }
    return this.word.getDescription();
}