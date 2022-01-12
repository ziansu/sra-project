public double getAverage() {
    if (!(listTests.isEmpty())) {
        double sumCoeff = 0.0;
        double sum = 0;
        for (esgi.fr.myaverage.models.Test test : listTests) {
            sum += (test.getMark()) * (test.getCoefficient());
            sumCoeff += test.getCoefficient();
        }
        return sum / sumCoeff;
    }else
        return -1.0;
    
}