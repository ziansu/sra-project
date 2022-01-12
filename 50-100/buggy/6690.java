@java.lang.Override
public void actionPerformed(java.awt.event.ActionEvent arg0) {
    done.push(grid);
    if (undone.isEmpty())
        sim.eqiv(grid, sim.takeStep(grid, mmax));
    else
        sim.eqiv(grid, undone.pop());
    
    sim.updateToGrid(frame, panel, grid, mmax);
}