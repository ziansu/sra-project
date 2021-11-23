public static boolean isNight(long time) {
    time = time % 24000;
    return (time >= 13000) && (time < 24000);
}