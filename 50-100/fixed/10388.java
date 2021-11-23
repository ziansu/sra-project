public int getXLocation(int position, com.edulectronics.tinycircuit.Models.Components.Connectors.ConnectionPointOrientation orientation) {
    switch (orientation) {
        case Top :
        case Bottom :
            return (((getColumn(position)) - 1) * (cellSize)) + ((int) (0.5 * (cellSize)));
        case Left :
            return ((getColumn(position)) - 1) * (cellSize);
        default :
            return (getColumn(position)) * (cellSize);
    }
}