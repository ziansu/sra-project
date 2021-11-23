public void updateLista(com.rubrica.BC.Persona updated, int index) {
    try {
        lista.update(updated, index);
    } catch (java.lang.NumberFormatException nfe) {
        javax.swing.JOptionPane.showMessageDialog(null, com.rubrica.BC.TabellaModel.NFE_MESSAGE);
    }
}