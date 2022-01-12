public uk.ac.leeds.ccg.andyt.grids.core.grid.Grids_Grid2DSquareCellDouble initiliseGrid(java.io.File dir) {
    uk.ac.leeds.ccg.andyt.grids.core.grid.Grids_Grid2DSquareCellDouble result = ((uk.ac.leeds.ccg.andyt.grids.core.grid.Grids_Grid2DSquareCellDouble) (gf.create(new uk.ac.leeds.ccg.andyt.grids.core.statistics.Grids_GridStatistics0(ge), dir, gcf, nrows, ncols, dimensions, ge, handleOutOfMemoryErrors)));
    for (int row = 0; row < (nrows); row++) {
        for (int col = 0; col < (ncols); col++) {
            result.setCell(row, col, 0, handleOutOfMemoryErrors);
        }
    }
    return result;
}