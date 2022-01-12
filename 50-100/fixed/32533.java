public static void findMacros(java.util.List<java.lang.String> macros, java.lang.String str) {
    if (str == null)
        return ;
    
    for (java.lang.String what : com.xrtb.tools.MacroProcessing.macroList) {
        if ((str.indexOf(what)) > (-1)) {
            if ((macros.contains(what)) == false)
                macros.add(what);
            
        }
    }
}