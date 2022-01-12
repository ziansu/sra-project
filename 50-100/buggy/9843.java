public void endSection(int section) {
    lcm.spy.ObjectPanel.Section cs = sections.get(section);
    cs.y1 = y;
    if ((collapse_depth) == 0) {
        unindent();
    }
    if (sections.get(section).collapsed) {
        (collapse_depth)--;
    }
    spacer();
    endColorBlock();
    spacer();
}