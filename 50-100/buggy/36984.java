public int[] getDamage() {
    java.lang.String[] s = this.config.getString("damage").split(",");
    int[] a = new int[s.length];
    for (int i = 0; i < (s.length); i++) {
        a[i] = (java.lang.Integer.parseInt(s[i])) + (getLevel());
    }
    return a;
}