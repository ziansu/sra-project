private Hex getWord(Hex index) {
    int i = index.toInt();
    if ((i > ((Simpletron.MEMORY_SIZE) - 1)) || (i < 0))
        fatalError("*** index out of bounds ***");
    
    Hex word = memory[i];
    if (((word.compareTo(Simpletron.MAX_WORD)) > 0) || ((word.compareTo(Simpletron.MIN_WORD)) < 0)) {
        fatalError("*** overflow occured ***");
    }
    return word;
}