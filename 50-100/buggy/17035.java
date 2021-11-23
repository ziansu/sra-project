@java.lang.Override
protected void calcFollowPos() {
    if (!(literalLookUp.containsKey(c))) {
        literalLookUp.put(c, new java.util.HashSet<>());
    }
    literalLookUp.get(c).add(java.lang.Integer.valueOf(this.id));
}