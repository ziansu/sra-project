@java.lang.Override
public void actionPerformed(java.awt.event.ActionEvent arg0) {
    if (!(done.isEmpty())) {
        undone.push(grid);
        sim.eqiv(grid, done.pop());
        java.lang.System.out.println("KKK");
        sim.updateToGrid(frame, panel, grid, mmax);
    }
}