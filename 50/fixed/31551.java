private double calcConsumption(java.util.List<com.jungbluth.johannes.petroltracker.data.PetrolData> petrolData) {
    double avgLiter = calcAvgLiter(petrolData);
    double avgDrivenKilometers = calcAvgDrivenKilometers(petrolData);
    if (avgDrivenKilometers == 0.0) {
        return 0.0;
    }
    return (avgLiter * 100.0) / avgDrivenKilometers;
}