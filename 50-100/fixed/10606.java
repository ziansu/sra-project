public ar.edu.unq.chasqui.model.Direccion obtenerDireccionPredeterminada() {
    for (ar.edu.unq.chasqui.model.Direccion d : this.getDireccionesAlternativas()) {
        if (d.getPredeterminada()) {
            return d;
        }
    }
    return ((this.getDireccionesAlternativas()) != null) && ((this.getDireccionesAlternativas().size()) > 0) ? this.getDireccionesAlternativas().get(0) : null;
}