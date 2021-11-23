public static boolean isBadWord(java.lang.String st) {
    for (int i = 0; i < (piglatin.PigLatin.badWords.size()); i++) {
        if (st.toLowerCase().contains(piglatin.PigLatin.badWords.get(i).toLowerCase())) {
            return true;
        }
    }
    return false;
}