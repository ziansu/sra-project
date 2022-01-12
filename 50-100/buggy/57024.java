public void fillMaal(int ID) {
    chr.Maal maal = retrieve.getRow(ID);
    java.lang.System.out.println(maal);
    goalStart.setValue(maal.fraDato);
    goalDoneAt.setValue(maal.oppnaaddDato);
    goalBox.setText(maal.maal);
    goalEnd.setValue(maal.tilDato);
    goalDelete.setVisible(true);
    if ((goalDoneAt.getValue()) != null) {
        goalAchieved.setVisible(true);
    }
}