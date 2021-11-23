public void endSection(int section) {
    lcm.spy.ObjectPanel.Section cs = sections.get(section);
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