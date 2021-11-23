public static void main(java.lang.String[] args) {
    com.c0ldcat.HackWLBServer s;
    if ((args.length) != 2) {
        s = new com.c0ldcat.HackWLBServer("0.0.0.0", 1234);
    }else {
        s = new com.c0ldcat.HackWLBServer(args[0], java.lang.Integer.parseInt(args[1]));
    }
    fi.iki.elonen.util.ServerRunner.executeInstance(s);
}