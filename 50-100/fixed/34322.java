private void checkArguments(java.lang.Object[] o) {
    checkArgument(((arguments.length) == (o.length)), o);
    for (int i = 0; i < (arguments.length); i++) {
        checkArgument(com.feed_the_beast.ftbl.lib.LangKey.canAssign(o[i], arguments[i]), o);
    }
}