private void closeIfDone() {
    if (!(isRegistered()))
        return ;
    
    if (((!(socketReader.getProducerStatus().isOpen())) && (!(socketWriter.getConsumerStatus().isOpen()))) && (writeQueue.isEmpty())) {
        io.datakernel.stream.net.TcpStreamSocketConnection.logger.trace("done, closing {}", this);
        close();
    }
}