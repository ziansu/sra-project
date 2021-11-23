private static agh.aq21gui.model.output.Selector convertFromStringSelector(java.lang.String sel) {
    agh.aq21gui.model.output.Selector s = new agh.aq21gui.model.output.Selector();
    sel = sel.replaceAll("\\(", "").replaceAll("\\)", "");
    java.lang.String[] tokens = sel.trim().split(" ");
    s.setName(tokens[0]);
    s.setComparator(tokens[1]);
    s.setValue(tokens[2]);
    return s;
}