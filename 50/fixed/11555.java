public static void main(java.lang.String[] args) {
    if (args[0].equals("-"))
        BurrowsWheeler.transform();
    else
        if (args[0].equals("+"))
            BurrowsWheeler.inverseTransform();
        
    
}