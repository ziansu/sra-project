@java.lang.Override
public bai4_rn.praktikum_01.command.ServerReply process() throws java.io.IOException {
    bai4_rn.praktikum_01.client.ClientData clientData = bai4_rn.praktikum_01.command.CommandUtils.getClientData();
    clientData.writeToServer(("EHLO " + (clientData.getHostname())));
    clientData.readFromServer();
    java.lang.String serverReply = clientData.readFromServer();
    return bai4_rn.praktikum_01.command.CommandUtils.createServerReply(serverReply);
}