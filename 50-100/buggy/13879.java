public static boolean isRIsign(java.lang.String line) {
    if ((((line.contains("restockit")) || (line.contains("restock it"))) || (line.contains("full chest"))) || (line.contains("full dispenser")))
        return true;
    else
        return false;
    
}