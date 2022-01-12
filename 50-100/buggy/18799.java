@org.testng.annotations.BeforeTest
public void setUp() {
    java.io.InputStream asciiStream = edu.cmu.sphinx.api.FeatureExtractorTest.class.getResourceAsStream("/edu/cmu/sphinx/api/10001-90210-01803.features");
    java.util.Scanner sc = new java.util.Scanner(asciiStream);
    int numDataPoints = sc.nextInt();
    java.lang.System.out.println(numDataPoints);
    features = new float[numDataPoints];
    int i = 0;
    while (sc.hasNextFloat()) {
        features[(i++)] = sc.nextFloat();
    } 
    sc.close();
}