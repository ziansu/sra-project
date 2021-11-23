public boolean hasCollision(field.Field f) {
    field.Cell cell = f.getCell(this.location.x, this.location.y);
    if (cell == null)
        return false;
    
    return ((this.state) == (field.CellType.SHAPE)) && ((cell.isSolid()) || (cell.isBlock()));
}