@java.lang.Override
public boolean extract(java.lang.String args) {
    boolean suc = false;
    int i = args.indexOf("\n");
    if ((i > 0) && ((i + 1) < (args.length()))) {
        key = decc.dht.Key.load(args.substring(0, i));
        ip = args.substring((i + 1));
        suc = true;
    }
    return suc;
}