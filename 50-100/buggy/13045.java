public static Bag getTestBag(int i) {
    Bag bag = new Bag(i);
    for (int j = 0; j < 10; j++) {
        Token t = CloneTestHelper.getTestToken();
        TokenFrequency tFrequency = new TokenFrequency();
        tFrequency.setToken(t);
        tFrequency.setFrequency(utility.Util.getRandomNumber(3, 1));
        bag.add(tFrequency);
    }
    return bag;
}