public void setData(de.lathanda.eos.interpreter.Type data) {
    this.type = data;
    unit = new de.lathanda.eos.gui.classchart.ClassUnit(data);
    setPreferredSize(layout(d));
    revalidate();
    repaint();
}