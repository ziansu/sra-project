public model.data.Item getItemFromArrayByPosition(model.data.Position p) {
    if (((((p.getP_x()) < 0) || ((p.getP_y()) < 0)) || ((p.getP_x()) > (this._width))) || ((p.getP_y()) > (this._height))) {
        return null;
    }
    return this._items.get(p.getP_y()).get(p.getP_x());
}