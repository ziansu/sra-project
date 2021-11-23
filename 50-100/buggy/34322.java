private void checkArguments(java.lang.Object[] o) {
    com.google.common.base.Preconditions.checkArgument(((arguments.length) == (o.length)));
    for (int i = 0; i < (arguments.length); i++) {
        com.google.common.base.Preconditions.checkArgument(com.feed_the_beast.ftbl.lib.LangKey.canAssign(o[i], arguments[i]));
    }
}