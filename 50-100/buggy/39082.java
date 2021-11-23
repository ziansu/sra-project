private static java.lang.String combine(java.util.ArrayList<java.lang.String> adder, java.lang.String base) {
    java.lang.Object[] hold = adder.toArray();
    for (java.lang.Object anImport : hold)
        base = base.concat(((anImport.toString()) + "\n"));
    
    return base;
}