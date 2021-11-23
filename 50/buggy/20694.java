public static void print(java.lang.String msg) {
    utils.LogManager.writeAndPrint((msg + "\n\nExit\n"));
    utils.LogManager.close();
    java.lang.System.exit(0);
}