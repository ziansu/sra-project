public static void main(java.lang.String[] args) throws java.io.IOException {
    com.levins.webportal.certificate.client.Client client = new com.levins.webportal.certificate.client.Client();
    com.levins.webportal.certificate.client.UI.ClientPanel clientPanel = new com.levins.webportal.certificate.client.UI.ClientPanel(client);
    clientPanel.setVisible(true);
}