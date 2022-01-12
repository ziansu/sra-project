@org.junit.Test
public void shouldRecognizeMerc() throws java.io.IOException {
    java.awt.image.BufferedImage image = extracted("/merc.png");
    double[] input = com.gmail.wysocki.maciej.NeuralNetworkTest.converter.convertToNormalized(image);
    com.gmail.wysocki.maciej.Answer answer = com.gmail.wysocki.maciej.NeuralNetworkTest.ai.recognizeCarLogo(input);
    org.junit.Assert.assertArrayEquals(new double[]{ 1 , 0 , 0 , 0 }, answer.getData(), com.gmail.wysocki.maciej.NeuralNetworkTest.MAX_ERROR);
}