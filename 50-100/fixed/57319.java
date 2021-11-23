private static double gcContent(java.lang.CharSequence primer) {
    int i = 0;
    int count = 0;
    while (i < (primer.length())) {
        char nuc = primer.charAt(i);
        if ((((nuc == 'G') || (nuc == 'C')) || (nuc == 'g')) || (nuc == 'c')) {
            count += 1;
        }
        i++;
    } 
    return (count * 1.0) / (primer.length());
}