public net.marcuswhybrow.minecraft.law.prison.PrisonCell removeCell(java.lang.String cellName) {
    net.marcuswhybrow.minecraft.law.prison.PrisonCell cell = cells.remove(cellName);
    if (cell != null) {
        cell.delete();
        setChanged("cells");
    }
    return cell;
}