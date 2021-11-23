@org.junit.Test
public void testHGapVGapAccessors() {
    com.github.bordertech.wcomponents.layout.FlowLayout flow;
    boolean isVertical;
    for (com.github.bordertech.wcomponents.layout.FlowLayout.Alignment a : FlowLayout.Alignment.values()) {
        isVertical = a == (FlowLayout.VERTICAL);
        flow = new com.github.bordertech.wcomponents.layout.FlowLayout(a, com.github.bordertech.wcomponents.layout.FlowLayout_Test.GAP);
        org.junit.Assert.assertEquals("Incorrect vertical gap", (isVertical ? com.github.bordertech.wcomponents.layout.FlowLayout_Test.GAP : 0), flow.getVgap());
        org.junit.Assert.assertEquals("incorrect horizontal gap", (isVertical ? 0 : com.github.bordertech.wcomponents.layout.FlowLayout_Test.GAP), flow.getHgap());
    }
}