@org.junit.Test
public void testSlideOneTextOne() {
    Data.Text text = currentSlideshow.getSlides().get(1).getTextList().get(0);
    java.lang.System.out.println((" HAHAHSHSA " + (currentSlideshow.getSlide(1).getImage(1).getSourceFile())));
    assertTrue(text.getAlignment().equals("none"));
    assertTrue(((currentSlideshow.getSlide(1).getImage(1).getSourceFile()) != null));
}