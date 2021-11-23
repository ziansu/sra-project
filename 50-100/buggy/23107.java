private void updatePaint(int time_piece_i) {
    if ((com.rebbity.widget.Rainbow.g_color_paints.length) != 0) {
        int index_curr;
        int index_next;
        index_curr = getCirculationIndex(time_piece_i, com.rebbity.widget.Rainbow.g_color_paints.length);
        index_next = getCirculationIndex((index_curr + 1), com.rebbity.widget.Rainbow.g_color_paints.length);
        m_paint_curr = com.rebbity.widget.Rainbow.g_color_paints[index_curr];
        m_paint_next = com.rebbity.widget.Rainbow.g_color_paints[index_next];
    }
}