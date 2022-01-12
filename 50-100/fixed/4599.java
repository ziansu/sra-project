@java.lang.Override
public void actionPerformed(java.awt.event.ActionEvent arg0) {
    if (!(done.isEmpty())) {
        long[][] temp = new long[n][n];
        sim.eqiv(temp, grid);
        undone.push(temp);
        sim.eqiv(grid, done.pop());
        sim.updateToGrid(frame, panel, grid, mmax);
    }
}