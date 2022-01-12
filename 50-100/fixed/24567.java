public java.lang.String dumpBackStack() {
    java.lang.String result = "dumpBackStack:\n";
    synchronized(mBackStack) {
        for (java.lang.Integer key : mBackStack.keySet())
            result += ((("key: '" + key) + "' -> '") + (mBackStack.get(key))) + "\'\n";
        
    }
    return result;
}