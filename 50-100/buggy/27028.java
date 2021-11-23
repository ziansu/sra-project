public static boolean checkString(java.lang.String string) {
    if ((string.length()) == 0) {
        return false;
    }else
        if ((string.trim().length()) == 0) {
            return false;
        }else
            if ((string.length()) > 25) {
                com.google.gwt.user.client.Window.alert("Длина строки должна быть меньше 25 символов");
                return false;
            }else
                return true;
            
        
    
}