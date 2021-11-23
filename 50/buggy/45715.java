private void runSpecial(me.okx.neim.token.Special sp, java.lang.String val) {
    me.okx.neim.stack.NStack ns = sp.special(stack, val, this);
    stack.clear();
    for (java.lang.Object o : ns) {
        stack.push(o);
    }
}