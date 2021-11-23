private int getNumberOfNicks() {
    int numberOfNicks = 1;
    for (int i = 0; i < (args.size()); i++) {
        if (args.get(i).endsWith(","))
            numberOfNicks = i + 2;
        
    }
    return numberOfNicks;
}