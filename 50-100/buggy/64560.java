public void nuevoPedidoIndividualPara(ar.edu.unq.chasqui.model.Cliente cliente, ar.edu.unq.chasqui.model.Pedido nuevoPedido) throws ar.edu.unq.chasqui.exceptions.ClienteNoPerteneceAGCCException {
    java.lang.String email = cliente.getEmail();
    ar.edu.unq.chasqui.model.MiembroDeGCC miembro = this.findMiembro(email);
    if (miembro == null) {
        throw new ar.edu.unq.chasqui.exceptions.ClienteNoPerteneceAGCCException(email);
    }
    miembro.abrirPedido();
    this.pedidoActual.agregarPedidoIndividual(nuevoPedido);
}