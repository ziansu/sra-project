public void setData(de.lathanda.eos.interpreter.Type data) {
    unit = new de.lathanda.eos.gui.classchart.ClassUnit(data);
    setPreferredSize(layout(d));
    revalidate();
    repaint();
}