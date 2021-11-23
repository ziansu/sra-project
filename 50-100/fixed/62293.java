private void buildComponentSimulationZoom() {
    m_sliderZoomSimulation = new javax.swing.JSlider();
    m_sliderZoomSimulation.setToolTipText("Zoom of the simulation");
    m_sliderZoomSimulation.setMinimum(1);
    m_sliderZoomSimulation.setMaximum(100);
    m_sliderZoomSimulation.setValue(20);
    m_sliderZoomSimulation.setPaintTicks(true);
    m_sliderZoomSimulation.setMinorTickSpacing(10);
    m_sliderZoomSimulation.setMajorTickSpacing(20);
    buildGroupLayoutComponentSimulationZoom();
}