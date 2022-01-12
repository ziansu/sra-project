public void addTypes(java.util.ArrayList<tokenizer.Token> names, parser.symbol.SymType type) throws java.lang.Exception {
    for (tokenizer.Token name : names) {
        if ((this.types.get(name)) != null) {
            throw new java.lang.Exception(java.lang.String.format("Type %s is already declared", name));
        }
        this.types.put(name.text, type);
    }
}