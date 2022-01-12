private java.lang.String getDisplayUserName() {
    if (((this.authCtx.getUser()) != null) && ((this.authCtx.getUser().getUserActor()) != null)) {
        return this.authCtx.getUser().getUserActor().getName();
    }
    return this.authCtx.getUsername();
}