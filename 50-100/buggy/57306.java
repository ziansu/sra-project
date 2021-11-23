private static boolean isEqual(@net.openhft.lang.model.constraints.Nullable
java.lang.CharSequence s, @net.openhft.lang.model.constraints.NotNull
java.lang.CharSequence cs) {
    if (s == null)
        return false;
    
    if ((s.length()) != (cs.length()))
        return false;
    
    for (int i = 0; i < (cs.length()); i++)
        if ((s.charAt(i)) != (cs.charAt(i)))
            return false;
        
    
    return true;
}