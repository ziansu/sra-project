public void train(int correctMood, Image image) {
    for (int i = 0; i < 20; i++) {
        for (int j = 0; j < 20; j++) {
            perceptrons[i][j].adjustWeights(correctMood, getInputsForPerceptron(perceptrons[i][j], image));
        }
    }
}