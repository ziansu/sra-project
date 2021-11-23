@java.lang.Override
public void actionPerformed(java.awt.event.ActionEvent e) {
    this.m_window1D.setm_isRun(false);
    this.m_window1D.dispose();
    com.ter.CellularAutomaton.vue.MainWindow2D window2D = new com.ter.CellularAutomaton.vue.MainWindow2D();
}