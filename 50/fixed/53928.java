public void storeValue(int cellNo, float value) {
    memory[cellNo] = value;
    simulator.getGui().updateMemoryCell(cellNo, value);
}