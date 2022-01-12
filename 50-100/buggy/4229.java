private void mutate() {
    java.util.Random r = new java.util.Random();
    java.lang.Integer pathIndex = r.nextInt(((this.path.size()) - 1));
    java.lang.Integer replaceIndex = r.nextInt(((this.operators.size()) - 1));
    path.set(pathIndex, operators.get(replaceIndex));
}