private void runSigma(int amount) {
    if (amount > (randomValuesList.size()))
        amount = randomValuesList.size();
    
    for (int i = (randomValuesList.size()) - amount; i < (randomValuesList.size()); i++) {
        double sigma = java.lang.Math.abs(((findAverage()) - (randomValuesList.get(i))));
        listSigma.add(sigma);
    }
    java.lang.System.out.println(("sigmaaa" + (listSigma)));
}