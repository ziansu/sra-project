public void action(org.apache.coyote.ActionCode actionCode, java.lang.Object param) {
    if ((hook) != null) {
        if (param == null) {
            hook.action(actionCode, this);
        }else {
            hook.action(actionCode, param);
        }
    }
}