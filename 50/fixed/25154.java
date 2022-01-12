public tolteco.sigma.model.entidades.Minor getMinor() {
    return new tolteco.sigma.model.entidades.Minor(((int) (MajorVer.getValue())), 0, MinorDate.getDate(), MinorNotes.getText());
}