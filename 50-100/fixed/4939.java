public static void main(java.lang.String[] args) {
    be.kdg.ai.backpropagation.controller.algorithm.NeuralNetwork neuralNetwork = new be.kdg.ai.backpropagation.controller.algorithm.BackPropagation(4, 2);
    be.kdg.ai.backpropagation.controller.Controller controller = new be.kdg.ai.backpropagation.controller.Controller(neuralNetwork);
    be.kdg.ai.backpropagation.controller.ViewController viewController = new be.kdg.ai.backpropagation.controller.ViewController(neuralNetwork);
    be.kdg.ai.backpropagation.view.JavaFxView javaFxView = new be.kdg.ai.backpropagation.view.JavaFxView();
    javaFxView.setViewController(viewController);
    be.kdg.ai.backpropagation.view.JavaFxView.launch(be.kdg.ai.backpropagation.view.JavaFxView.class, args);
}