public static boolean isRIsign(java.lang.String line) {
    java.lang.String str = line.toLowerCase();
    if ((((str.contains("restockit")) || (str.contains("restock it"))) || (str.contains("full chest"))) || (str.contains("full dispenser")))
        return true;
    else
        return false;
    
}