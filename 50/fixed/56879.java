public static boolean validateUrban(java.lang.String urban) {
    if (urban == null)
        return false;
    else
        if ((urban.equals("Y")) || (urban.equals("N")))
            return true;
        else
            return false;
        
    
}