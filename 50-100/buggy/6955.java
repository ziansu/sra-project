public static boolean pressed(java.lang.String key) {
    if (key == null)
        return false;
    else
        if (apcs.Window.keyMap.containsKey(key))
            return apcs.Window.getInstanceFromThread().isVirtualKeyPressed(apcs.Window.keyMap.get(key));
        else
            if ((key.length()) > 0)
                return apcs.Window.key.pressed(key.charAt(0));
            
        
    
    return false;
}