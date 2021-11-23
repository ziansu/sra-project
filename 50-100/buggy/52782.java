private void compute() {
    while (true) {
        java.lang.System.out.println("-");
        int hP = getLowest();
        if (hP == (-1))
            break;
        
        int vP = lowestRatio(hP);
        gje(hP, vP);
        basis[(vP - 1)] = hP - 1;
    } 
}