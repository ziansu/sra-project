protected void printChat(final java.lang.Object[] in, java.lang.Object... args) {
    java.lang.Object[] dest = new java.lang.Object[(in.length) + (args.length)];
    java.lang.System.arraycopy(in, 0, dest, 0, in.length);
    java.lang.System.arraycopy(args, 0, dest, in.length, args.length);
    this.mod.getUtility().printChat(dest);
}