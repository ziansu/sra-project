@org.junit.Test
public void testHorizontalSeamPath3x4Picture() {
    SeamCarverTest.PicturePoint[][] picturePoints = getPicturePoints("3x4.printseams.txt", 3, 4);
    SeamCarver seamCarver = getSeamCarver(getPicture("3x4.png"));
}