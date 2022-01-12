public void roll(int sides) {
    if (!(mRolls.containsKey(sides))) {
        mRolls.put(sides, new java.util.ArrayList<java.lang.Integer>());
    }
    mRolls.get(sides).add(((rand.nextInt((sides - 1))) + 1));
}