private void compute() {
    while (true) {
        int hP = getLowest();
        if (hP == (-1))
            break;
        
        int vP = lowestRatio(hP);
        gje(vP, hP);
        basis[(vP - 1)] = hP - 1;
    } 
}