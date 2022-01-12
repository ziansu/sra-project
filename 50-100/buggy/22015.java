private double meanPPM(int ppmValue) {
    double result = 0;
    for (ricocalculator.Line line : lines) {
        if ((line.getPpmValues()[ppmValue]) != 0) {
            result += line.getPpmValues()[ppmValue];
        }
    }
    return result / (lines.size());
}