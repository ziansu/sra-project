public void gradientAscent(double[] oldState, double[] currentState, int maxIterations) {
    double[] state = currentState;
    double alpha = 0.01;
    double oldGradient = 0;
    double gradient = 1;
    for (int i = 0; i < maxIterations; i++) {
        if ((gradient - oldGradient) < 0) {
            break;
        }
        gradient = calculateGradient(oldState, state);
        oldState = state;
        state = getNewState(state, gradient, alpha);
        oldGradient = gradient;
    }
}