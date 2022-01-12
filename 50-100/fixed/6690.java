@java.lang.Override
public void actionPerformed(java.awt.event.ActionEvent arg0) {
    long[][] temp = new long[n][n];
    sim.eqiv(temp, grid);
    done.push(temp);
    if (undone.isEmpty())
        sim.eqiv(grid, sim.takeStep(grid, mmax));
    else
        sim.eqiv(grid, undone.pop());
    
    sim.updateToGrid(frame, panel, grid, mmax);
}