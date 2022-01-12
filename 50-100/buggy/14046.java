public void xorHashMapWithNewCharacters(java.util.HashMap<java.lang.Character, java.lang.Integer> hm, java.lang.String s2) {
    for (char c : s2.toCharArray()) {
        if (((hm.get(c)) != null) && ((hm.get(c)) > 0)) {
            hm.put(c, ((hm.get(c)) - 1));
        }else {
            hm.put(c, 1);
        }
    }
}