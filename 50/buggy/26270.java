public final synchronized org.optimizationBenchmarking.utils.graphics.style.color.ColorStyle allocateColor() {
    final int index;
    this.m_usedColors = index = ((this.m_usedColors) + 1) % (this.m_def.m_colorsSize);
    return this.m_def.m_colors.get(index);
}