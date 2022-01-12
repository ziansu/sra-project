public void addKnownSymbols(java.util.List<java.lang.String> knownSymbols) {
    lockMe(this);
    if (knownSymbols == null) {
        this.knownSymbols = knownSymbols;
    }else {
        for (java.lang.String symbol : knownSymbols) {
            symbol = symbol.toLowerCase();
            if (!(this.knownSymbols.contains(symbol))) {
                this.knownSymbols.add(symbol);
            }
        }
    }
    unlockMe(this);
}