@java.lang.Override
public java.lang.String toString() {
    java.lang.StringBuilder result = new java.lang.StringBuilder();
    result.append("({");
    for (char vowel : vowels) {
        result.append(vowel).append(", ");
    }
    result.deleteCharAt(((result.length()) - 1));
    result.append("}, ").append(length).append("}");
    return result.toString();
}