public void endSection(int section) {
    lcm.spy.ObjectPanel.Section cs = sections.get(section);
    cs.y1 = y;
    if (sections.get(section).collapsed)
        (collapse_depth)--;
    
    unindent();
    spacer();
    endColorBlock();
    spacer();
}