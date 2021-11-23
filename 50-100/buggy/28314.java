public boolean hasCollision(field.Field f) {
    field.Cell cell = f.getCell(this.location.x, this.location.y);
    return (cell == null) && (((this.state) == (field.CellType.SHAPE)) && ((cell.isSolid()) || (cell.isBlock())));
}