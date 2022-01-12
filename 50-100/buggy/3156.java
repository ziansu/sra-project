public void colidateOwnFigureKing(model.IFigure f, model.Player p) {
    setFigureList(p.getFigureList());
    getColi().setFigureList(getFigureList());
    getColi().unmovedFigures(f);
    setFigureList(getColi().getFigureList());
    setPossibleFields(f.getPosFields());
    checkColidateOwn();
    f.setPosFields(getPossibleFields());
}