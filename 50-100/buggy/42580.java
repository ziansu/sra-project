private double calCurrentGPA(double[] gpa) {
    double sum = 0;
    for (int i = 0; i < (gpa.length); i++) {
        if ((this.gpaRates[i]) == 0.0) {
            break;
        }else {
            sum += (gpa[i]) / (this.gpaRates[i]);
        }
    }
    return sum;
}