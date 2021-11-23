public ij.ImagePlus GetImageSum() {
    ij.plugin.ImageCalculator ic = new ij.plugin.ImageCalculator();
    ij.ImagePlus imp3 = m_Stack.get(0);
    for (int i = 1; i < (m_Stack.size()); i++) {
        imp3 = ic.run("Subtract create", m_Stack.get(0), imp3);
    }
    return imp3;
}