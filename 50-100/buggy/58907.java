public static boolean cointoss(int chance) {
    java.util.Random r = new java.util.Random();
    int Low = 1;
    int High = 100;
    int Result = (r.nextInt((High - Low))) + Low;
    if (Result < chance)
        return true;
    else
        return false;
    
}