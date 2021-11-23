@org.jetbrains.annotations.Contract(value = "null -> false")
public static boolean allLetters(java.lang.String string) {
    if ((string == null) || (com.example.miljanrakita.shoppingapplication.Util.Util.isEmpty(string)))
        return false;
    
    char[] arr = string.toCharArray();
    for (char c : arr)
        if (!(((c >= 'a') && (c < 'z')) || ((c >= 'A') && (c <= 'Z'))))
            return false;
        
    
    return true;
}