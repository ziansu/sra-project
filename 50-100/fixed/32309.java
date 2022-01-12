public boolean equals(java.lang.Object obj) {
    if (obj == (this)) {
        return true;
    }else
        if (!(obj instanceof gov.nist.javax.sip.stack.Dialog)) {
            return false;
        }else {
            java.lang.String id1 = this.getDialogId();
            java.lang.String id2 = ((gov.nist.javax.sip.stack.Dialog) (obj)).getDialogId();
            return ((id1 != null) && (id2 != null)) && (id1.equals(id2));
        }
    
}