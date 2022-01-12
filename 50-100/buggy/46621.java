@java.lang.Override
public java.lang.Object getValueAt(int row, int column) {
    ar.edu.ungs.business.dto.AutorizacionPracticaDTO value = getModelValue(row);
    switch (column) {
        case 0 :
            return value.getPractica().getCodigo();
        case 1 :
            return value.getPractica().getNombre();
        case 2 :
            return value.getCantidadSesiones();
        default :
            return null;
    }
}