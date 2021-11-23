private java.lang.Character getRandomButton(java.util.List<java.util.List<java.lang.Integer>> lists, int stage) {
    java.util.List<java.lang.Integer> keys = new java.util.LinkedList<>();
    for (int i = 0; i < (stage + 1); i++) {
        keys.addAll(lists.get(i));
    }
    return java.lang.Character.valueOf(java.awt.event.KeyEvent.getKeyText(keys.get(this.random.nextInt(keys.size()))).toCharArray()[0]);
}