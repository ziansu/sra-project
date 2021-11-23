public static void main(java.lang.String[] args) {
    if ((args.length) != 1) {
        com.neu.mrlite.clients.MRLiteClientBoot.usageAndExit();
    }
    com.neu.mrlite.clients.MRLiteClientBoot.startClient(args[1]);
}