private java.util.HashMap<java.lang.Character, javax.swing.ImageIcon> generateIconMap() {
    java.util.HashMap<java.lang.Character, javax.swing.ImageIcon> iconMap = new java.util.HashMap<java.lang.Character, javax.swing.ImageIcon>();
    for (char letter = 'A'; letter < 'Z'; letter++) {
        iconMap.put(letter, new javax.swing.ImageIcon(playerBoundary.PlayField.class.getResource((("/images/" + letter) + ".png"))));
    }
    return iconMap;
}