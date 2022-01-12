private boolean startCellMatchesHandoverStart(de.tu_berlin.snet.cellservice.model.record.CellInfo startCell, java.util.ArrayList<de.tu_berlin.snet.cellservice.model.record.Handover> handovers) {
    if ((handovers.size()) > 0) {
        if (Check.Network.isSameCell(startCell, handovers.get(0).getStartCell())) {
            return true;
        }else {
            return false;
        }
    }
    return true;
}