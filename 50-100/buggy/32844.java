@java.lang.Override
@javax.annotation.OverridingMethodsMustInvokeSuper
public void setComment(java.lang.String comment) {
    java.lang.String old = this.comment;
    if (((comment == null) || (comment.isEmpty())) || ((comment.trim().length()) < 1)) {
        this.comment = null;
    }else {
        this.comment = comment;
    }
    firePropertyChange("Comment", old, comment);
}