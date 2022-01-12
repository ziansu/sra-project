public static boolean pushOnThisHourOfTheDay(double accepted, double declined, double manual, int hourOfTheDay) {
    double daytimefactor = com.example.puppetmaster.vokabeltrainer.SpacedRepititionSystem.Notifier.PushProbabilityCalculator.getDayTimeFactor(hourOfTheDay);
    double result = daytimefactor * ((accepted + (manual * (com.example.puppetmaster.vokabeltrainer.SpacedRepititionSystem.Notifier.PushProbabilityCalculator.factorManual))) / ((accepted + declined) + (manual * (com.example.puppetmaster.vokabeltrainer.SpacedRepititionSystem.Notifier.PushProbabilityCalculator.factorManual))));
    return result >= (java.lang.Math.random());
}