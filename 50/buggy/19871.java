public static void setForDevMode() {
    java.lang.System.out.println("SET FOR DEV");
    java.lang.System.exit(1);
    uk.co.brotherlogic.mdb.Connect.operationMode = uk.co.brotherlogic.mdb.Connect.mode.DEVELOPMENT;
    uk.co.brotherlogic.mdb.Connect.forced = true;
}