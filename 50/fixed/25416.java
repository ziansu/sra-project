@org.junit.Test
public void testLatency() {
    se.imagick.ft.slidingdft.DFTSlider slider = getSliderWithComponents(4, comp1PhasedPlus90, comp2PhasedMinus90);
    org.junit.Assert.assertEquals(comp1PhasedPlus90.length, slider.getLatencyInSamples());
}