public com.example.aidan.mathfunfacts.ParserMathFunFact findRandomMFF() {
    java.util.Random rand = new java.util.Random();
    int n = (rand.nextInt(199)) + 1;
    return MathFunFacts.get(n);
}