public java.io.File recv_file(java.lang.String folderPath) throws java.io.IOException {
    java.lang.String transfer_type = recv_msg();
    send_msg("Ok");
    folderPath += recv_msg();
    send_msg("Ok");
    java.lang.String f_size = recv_msg();
    send_msg("Ok");
    java.io.File file = new java.io.File(folderPath);
    if (transfer_type.equals(net.jsock.FileTransferSocket.TransferType.MULTISTAGE))
        return multi_stage_recv(file, java.lang.Long.getLong(f_size));
    
    return single_stage_recv(file, java.lang.Integer.parseInt(f_size));
}