private void displayCharacters(java.util.List<java.lang.Character> charList) {
    for (java.lang.Character c : charList) {
        java.lang.System.out.println((((ClassDesign.LINEBREAK) + (ClassDesign.MARKER)) + (c.getName())));
        java.lang.System.out.println(((ClassDesign.LINEBREAK) + (ClassDesign.ATKOPTIONS)));
        c.attackOptions();
        java.lang.System.out.println(((ClassDesign.LINEBREAK) + (ClassDesign.DEFOPTIONS)));
        c.defenseOptions();
    }
}