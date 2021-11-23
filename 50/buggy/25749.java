@com.github.holgerbrandl.spark.components.Setup(value = Level.Trial)
public void setUp() {
    testImage = com.github.holgerbrandl.spark.components.ImageUtils.makeTestImage(new int[]{ imageSize , imageSize , 1 }, threshold);
}