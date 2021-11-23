public static boolean percentChance(double percent) {
    assert percent > 0;
    return (utility.Extra.random.nextDouble()) > (percent / 100);
}