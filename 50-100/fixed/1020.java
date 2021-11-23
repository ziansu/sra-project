protected void enviarMensagemJms(br.org.arquitetura.model.persistence.entity.listener.EventoEntidade.Tipo tipo, java.io.Serializable payloadDoEvento) {
    if ((tipo != null) && (payloadDoEvento != null)) {
        contextoJms.createProducer().setProperty("tipoEvento", tipo.name()).send(fila, payloadDoEvento);
        br.org.arquitetura.mensageria.AbstractNotificadorJms.logger.info(("mensagem JMS enviada: " + (br.org.arquitetura.utils.LogSanitizer.sanitize(payloadDoEvento.toString()))));
    }
}