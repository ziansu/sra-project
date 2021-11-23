private void out(java.lang.String msg) {
    ctx.getStdOut().println(((spaces()) + (msg.replace("\n", ("\n" + (spaces()))))));
}