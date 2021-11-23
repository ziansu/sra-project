@java.lang.Override
public boolean extract(java.lang.String args) {
    int i = args.indexOf("\n");
    if ((i > 0) && ((i + 1) < (args.length()))) {
        ip = args.substring(0, i);
        id = decc.dht.Key.load(args.substring((i + 1)));
    }
    return (i > 0) && (((args.length()) - i) > 0);
}