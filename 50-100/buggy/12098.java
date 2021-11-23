private int getYLocation(int position, com.edulectronics.tinycircuit.Models.Components.Connectors.ConnectionPointOrientation orientation) {
    switch (orientation) {
        case Left :
        case Right :
            return (((getRow(position)) - 1) * (cellSize)) + ((int) (0.5 * (cellSize)));
        case Top :
            return ((getRow(position)) - 1) * (cellSize);
        default :
            return (getColumn(position)) * (cellSize);
    }
}