private void mutate() {
    java.util.Random r = new java.util.Random();
    java.lang.Integer pathIndex = r.nextInt(java.lang.Math.abs(((this.path.size()) - 1)));
    java.lang.Integer replaceIndex = r.nextInt(java.lang.Math.abs(((this.operators.size()) - 1)));
    path.set(pathIndex, operators.get(replaceIndex));
}