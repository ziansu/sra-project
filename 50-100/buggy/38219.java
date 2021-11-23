private java.lang.String choseRandom(int size, int start, int end) {
    java.lang.String result = "";
    java.util.Random random = new java.util.Random();
    for (int i = 0; i < size; i++)
        result += java.lang.String.valueOf(chars.get(((random.nextInt((end - start))) + 1)));
    
    return result;
}