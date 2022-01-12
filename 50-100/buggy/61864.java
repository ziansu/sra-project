private boolean overlaps(datamodel.Position p, int x, int y) {
    return (((x < ((p.x()) + (datamodel.cr.CrDrawing.EVENT_WIDTH))) && ((x + (datamodel.cr.CrDrawing.EVENT_WIDTH)) > (p.x()))) && (y < ((p.y()) + (datamodel.cr.CrDrawing.EVENT_HEIGHT)))) && ((y + (datamodel.cr.CrDrawing.EVENT_WIDTH)) > (p.y()));
}