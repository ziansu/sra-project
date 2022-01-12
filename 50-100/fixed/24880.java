private void SendAnswer(java.net.DatagramPacket p) {
    if (((socket) != null) && (p != null)) {
        java.lang.String answer = ((("ToliTili:" + (masterName)) + ":") + (imageID)) + ":!";
        p.setData(answer.getBytes());
        try {
            socket.send(p);
        } catch (java.lang.Exception e) {
            java.lang.System.out.println("DiscoveryModule.SendAnswer: Can't send answer!");
        }
    }else {
        java.lang.System.out.println("DiscoveryModule.SendAnswer: Socket or data is NULL!");
    }
}