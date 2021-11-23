public void colidateOtherFigureDiagonal(model.IFigure f, model.Player p) {
    setFigureList(p.getFigureList());
    setFields(f.getPosFields());
    checkColiOtherDiag();
    f.setPosFields(getFields());
}