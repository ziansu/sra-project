public void mutate() {
    for (java.util.Map.Entry<java.lang.String, java.lang.Double> entry : this.getValues().entrySet()) {
        if (GeneticMain.r.nextBoolean()) {
            entry.setValue(((entry.getValue()) + (((GeneticMain.r.nextDouble()) - 0.5) * (GeneticMain.temp))));
            if ((entry.getValue()) <= 0) {
                entry.setValue(0.0);
            }
        }
    }
}