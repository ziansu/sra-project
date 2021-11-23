public static void logThis(java.lang.String key, double value) {
    if (org.usfirst.frc.team3309.communications.BlackBox.logHash.containsKey(key)) {
        org.usfirst.frc.team3309.communications.BlackBox.logHash.put(key, value);
    }else {
        org.usfirst.frc.team3309.communications.BlackBox.logHash.put(key, value);
        org.usfirst.frc.team3309.communications.BlackBox.HEADER.add(key);
        org.usfirst.frc.team3309.communications.BlackBox.writeHeader();
        java.lang.System.out.println((("Logged Parameter '" + key) + "' not found. Add this parameter to the Blackbox initilization."));
    }
}