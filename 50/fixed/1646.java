public static void main(java.lang.String[] args) throws java.io.FileNotFoundException {
    stableMarriage.StableMarriage SM = new stableMarriage.StableMarriage();
    SM.readCouplesFromFile(args[0]);
    SM.writeSMToConsole();
    SM.writeSMToFile(args[1]);
}