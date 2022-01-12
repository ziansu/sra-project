@java.lang.Override
public void load(edu.psu.sweng500.team8.io.BinaryInputStream stream) throws java.io.IOException {
    for (int rowIndex = 0; rowIndex < 9; rowIndex++) {
        for (int columnIndex = 0; columnIndex < 9; columnIndex++) {
            edu.psu.sweng500.team8.coreDataStructures.Cell cell = m_cells[rowIndex][columnIndex] = new edu.psu.sweng500.team8.coreDataStructures.Cell();
            cell.load(stream);
        }
    }
}