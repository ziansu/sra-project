public void train(Image image) {
    for (int i = 0; i < 20; i++) {
        for (int j = 0; j < 20; j++) {
            perceptrons[i][j].adjustWeights(image.answer, getInputsForPerceptron(perceptrons[i][j], image));
        }
    }
}