public void undepend(final java.lang.String... jids) throws java.io.IOException {
    final java.util.List<java.lang.String> args = new java.util.ArrayList<>();
    args.add(this.jid);
    args.add("off");
    java.util.Collections.addAll(args, jids);
    final java.lang.String[] array = new java.lang.String[args.size()];
    args.toArray(array);
    this.client.call(LuaCommand.DEPENDS, array);
}