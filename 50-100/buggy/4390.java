private void getInfo() {
    bta.startDiscovery();
    if ((bestName) != null) {
        try {
            outputStream.writeUTF(bestName);
            java.lang.String response = inputStream.readUTF();
            info.setText(response);
        } catch (java.io.IOException e) {
            e.printStackTrace();
        }
        bestDistance = -200;
        bestName = null;
    }
}