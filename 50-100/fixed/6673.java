public static void main(java.lang.String[] args) throws java.io.IOException {
    if (3 != (args.length)) {
        upem.jarret.worker.ClientJarRet.usage();
        return ;
    }
    upem.jarret.worker.ClientJarRet client = new upem.jarret.worker.ClientJarRet(args[0], args[1], java.lang.Integer.parseInt(args[2]));
    client.launch();
}