public void storeWord(Hex index, Hex word) {
    int i = index.toInt();
    if (((word.compareTo(Simpletron.MAX_WORD)) > 0) || ((word.compareTo(Simpletron.MIN_WORD)) < 0)) {
        fatalError("*** overflow occured ***");
    }
    if ((i > ((Simpletron.MEMORY_SIZE) - 1)) || (i < 0)) {
        fatalError("*** index out of bounds ***");
    }
    memory[i] = word;
}