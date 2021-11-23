private java.lang.String golemSubtype() {
    java.lang.String[] types = new java.lang.String[]{ "granite" , "petrified fungus" , "marshmallow" };
    int index;
    int bounds;
    int minValue;
    int maxValue;
    minValue = 0;
    maxValue = types.length;
    bounds = (maxValue - minValue) + 1;
    index = (splendid.scallywags.maniac_miner.business.ActorFactory.randomNumberGenerator.nextInt(bounds)) + minValue;
    return types[index];
}