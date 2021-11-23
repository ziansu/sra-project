private int availablePop(java.util.Collection<java.lang.Integer> dest, int count) {
    while ((count--) > 0)
        dest.add(availablePop());
    
    return 0;
}