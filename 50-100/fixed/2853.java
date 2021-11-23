public double predict(double[] vals) {
    java.lang.System.out.println("Predicting...");
    if ((vals == null) || ((vals.length) != (inputs.length))) {
        java.lang.System.out.printf("Error: Invalid Input");
        return 0.0;
    }
    for (int i = 0; i < (inputs.length); i++) {
        inputs[i].updateValue(vals[i]);
    }
    return output.getValue();
}