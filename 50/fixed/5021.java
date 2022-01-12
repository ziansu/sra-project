private static float returnDifference(float firstNum, float secNum, int position) {
    float difference = java.lang.Math.abs((firstNum - secNum));
    int remainder = ((int) (difference % (database.ComparePlayers.differenceNums[position])));
    return remainder;
}