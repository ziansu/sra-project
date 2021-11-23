public static boolean checkString(java.lang.String string) {
    if ((string.length()) == 0) {
        return false;
    }else
        if ((string.trim().length()) == 0) {
            return false;
        }else
            if ((string.length()) > 25) {
                return false;
            }else
                return true;
            
        
    
}