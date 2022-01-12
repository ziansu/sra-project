public java.lang.String decrypt(java.lang.String input) throws java.lang.Exception {
    int i;
    java.lang.String temp = new java.lang.String(input);
    for (i = (sequence.size()) - 1; 0 < i; i--) {
        temp = sequence.get(i).decrypt(temp);
    }
    return temp;
}