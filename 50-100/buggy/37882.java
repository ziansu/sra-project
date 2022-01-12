public static boolean isBadWord(java.lang.String st) {
    for (int i = 0; i < (piglatin.PigLatin.badWords.size()); i++) {
        if (st.toLowerCase().contains(piglatin.PigLatin.badWords.get(i).toLowerCase())) {
            java.lang.System.out.println(" in method isBadWord - bad word is detected");
            return true;
        }
    }
    return false;
}