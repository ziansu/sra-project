@java.lang.Override
public java.lang.String decode(java.lang.String plain) {
    java.lang.String decrypted = "";
    for (char letter : plain.toUpperCase().toCharArray()) {
        int index = com.soesec.util.Alphabet.IndexOf(letter);
        if (index < 0) {
            decrypted += letter;
            continue;
        }
        int i = index - (info.getRightShift());
        if (i < 0) {
            i = 26 + i;
        }
        i = i % 26;
        decrypted += com.soesec.util.Alphabet.At(i);
    }
    return decrypted;
}