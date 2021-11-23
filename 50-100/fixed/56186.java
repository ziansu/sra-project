private static boolean checkIdentity(com.jrodolfo.basichibernate.entity.Message message_01, com.jrodolfo.basichibernate.entity.Message message_02) {
    java.lang.System.out.println("Checking if the following objects are identical:");
    java.lang.System.out.println(("\tmessage_01: " + message_01));
    java.lang.System.out.println(("\tmessage_02: " + message_02));
    boolean areIdentical = message_01 == message_02;
    if (areIdentical) {
        java.lang.System.out.println("\tmessage_01 and message_02 are identical");
    }else {
        java.lang.System.out.println("\tmessage_01 and message_02 are NOT identical");
    }
    return areIdentical;
}