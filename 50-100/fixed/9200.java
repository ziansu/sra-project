public void lernen() {
    java.lang.String tf;
    tf = letter.getText().toLowerCase();
    for (int w = 0; w < 26; w++) {
        if (tf.equals(("" + (alphabet[w])))) {
            alpha[w] = ja;
        }
    }
    ann.backpropagate(new com.github.jannled.lib.math.Matrix(feld, 1, feld.length), new com.github.jannled.lib.math.Matrix(alpha, 1, alpha.length));
}