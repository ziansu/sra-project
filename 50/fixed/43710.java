public static boolean randomGenderSelection() {
    double randomness = java.lang.Math.random();
    if (randomness < 0.5)
        return true;
    else
        return false;
    
}