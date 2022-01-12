@java.lang.Override
public void addEdge(int id, int startX, int startY, int endX, int endY, int rank) {
    if (rank == 0) {
        nl.defsoftware.mrgb.view.models.RibbonLine ribbonLine = new nl.defsoftware.mrgb.view.models.RibbonLine(determineLength(startY, endY));
        ribbonLine.relocate(startX, startY);
        allEdges.add(ribbonLine);
    }else {
        nl.defsoftware.mrgb.view.models.RibbonCurve ribbon = new nl.defsoftware.mrgb.view.models.RibbonCurve(rank, startX, startY, endX, endY, isOpeningCurve(startX, endX));
        allEdges.add(ribbon);
    }
}