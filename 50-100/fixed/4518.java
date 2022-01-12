public void clear(org.kutsuki.akanana.shoe.Hand hand) {
    hand.clear();
    org.junit.Assert.assertEquals("Unexpected Size", hand.size(), 0);
    org.junit.Assert.assertEquals("Unexpected Soft", hand.getSoft(), 0);
    org.junit.Assert.assertEquals("Unexpected String", hand.toString(), "");
    org.junit.Assert.assertEquals("Unexpected Value", hand.getValue(), 0);
}