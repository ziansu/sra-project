public void removeCell(java.lang.String cellName) {
    net.marcuswhybrow.minecraft.law.prison.PrisonCell cell = cells.remove(name);
    if (cell != null) {
        cell.delete();
        setChanged("cells");
    }
}