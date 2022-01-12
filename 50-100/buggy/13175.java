public static int idOf(char c) {
    for (int i = 0; i < (kupihleba.Alphabet.total.length); i++) {
        if ((kupihleba.Alphabet.total[i]) == c)
            return i;
        
    }
    throw new java.lang.RuntimeException("Unknown data");
}