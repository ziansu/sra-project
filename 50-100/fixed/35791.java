@org.junit.Test
public void getModel() {
    this.mavContainer.addAttribute("name", "value");
    assertEquals(1, this.mavContainer.getModel().size());
    assertEquals("value", this.mavContainer.getModel().get("name"));
}