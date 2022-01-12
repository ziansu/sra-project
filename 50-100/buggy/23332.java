private void send_pkey() {
    mp.setType(MessageParser.TYPE.PUBLIC_KEY);
    java.lang.String str = java.util.Base64.getEncoder().encodeToString(DH.getPublicKey());
    java.lang.System.out.println(("decodedKey: " + (DH.getPublicKey().length)));
    java.lang.System.out.println(str);
    mp.setMsg(str);
    send(mp.GenerateMsg());
}