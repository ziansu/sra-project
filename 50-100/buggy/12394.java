private boolean hayCamposVacios(entities.Contrato t) {
    return ((((t.getIdentificador().equals("")) || ((t.getPropiedad().getCalle()) == null)) || ((t.getCliente().getPersona()) == null)) || ((t.getCreador().getPersona()) == null)) || (t.getGarantia().equals(""));
}