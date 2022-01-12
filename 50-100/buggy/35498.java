public double getMaxScore() {
    double maxScore = 0;
    for (int i = 0; i < (dependents.size()); i++) {
        java.lang.Double childScore = dependents.get(i).getScore();
        if ((java.lang.Math.abs((childScore - 0.5))) > (java.lang.Math.abs((maxScore - 0.5))))
            maxScore = childScore;
        
    }
    return maxScore;
}