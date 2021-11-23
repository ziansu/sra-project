public void endSection(int section) {
    lcm.spy.ObjectPanel.Section cs = sections.get(section);
    if (sections.get(section).collapsed) {
        (collapse_depth)--;
    }
    if ((collapse_depth) == 0) {
        unindent();
    }
    spacer();
    endColorBlock();
    spacer();
}