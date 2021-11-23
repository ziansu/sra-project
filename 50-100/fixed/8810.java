@java.lang.Override
public void addRow(ar.edu.ungs.business.dto.AutorizacionPracticaDTO item) {
    getElementos().add(item);
    java.lang.Object[] vector = new java.lang.Object[2];
    vector[0] = item.getPractica().getCodigo();
    vector[1] = item.getPractica().getNombre();
    super.addRow(vector);
}