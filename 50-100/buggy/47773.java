@org.junit.Test
public void shouldRecognizeMazda() throws java.io.IOException {
    java.awt.image.BufferedImage image = extracted("/mazda.png");
    double[] input = com.gmail.wysocki.maciej.NeuralNetworkTest.converter.convertToNormalized(image);
    com.gmail.wysocki.maciej.Answer answer = com.gmail.wysocki.maciej.NeuralNetworkTest.ai.recognizeCarLogo(input);
    org.junit.Assert.assertArrayEquals(new double[]{ 0 , 0 , 1 }, answer.getData(), com.gmail.wysocki.maciej.NeuralNetworkTest.MAX_ERROR);
}