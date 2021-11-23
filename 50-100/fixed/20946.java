public void depend(final java.lang.String... jids) throws java.io.IOException {
    final java.util.List<java.lang.String> args = new java.util.ArrayList<>();
    args.addAll(java.util.Arrays.asList(this.jid, "on"));
    for (final java.lang.String jid : jids) {
        args.add(jid);
    }
    final java.lang.Object[] array = args.toArray(new java.lang.String[args.size()]);
    this.client.call(LuaCommand.DEPENDS, array);
}