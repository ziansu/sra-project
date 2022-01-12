public java.lang.String dumpBackStack() {
    java.lang.String result = "dumpBackStack:\n";
    for (java.lang.Integer key : mBackStack.keySet())
        result += ((("key: '" + key) + "' -> '") + (mBackStack.get(key))) + "\'\n";
    
    return result;
}