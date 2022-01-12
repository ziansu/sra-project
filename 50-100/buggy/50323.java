private java.lang.Character getRandomButton(java.util.ArrayList<java.util.ArrayList<java.lang.Integer>> lists, int stage) {
    java.util.ArrayList<java.lang.Integer> keys = new java.util.ArrayList<>();
    for (int i = 0; i < (stage + 1); i++) {
        keys.addAll(lists.get(i));
    }
    return java.lang.Character.valueOf(java.awt.event.KeyEvent.getKeyText(keys.get(this.random.nextInt(keys.size()))).toCharArray()[0]);
}