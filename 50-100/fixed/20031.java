private void getFrequencies() {
    for (int i = 0; i < (ciphertext.length()); i++) {
        if ((ciphertext.charAt(i)) != ' ') {
            int charvalue = ((int) (ciphertext.charAt(i))) - 97;
            (frequencies[charvalue])++;
        }
    }
}