public com.example.aidan.mathfunfacts.ParserMathFunFact findRandomMFF() {
    java.util.Random rand = new java.util.Random();
    int n = rand.nextInt(MathFunFacts.size());
    return MathFunFacts.get(n);
}