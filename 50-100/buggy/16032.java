public spirax.message.Message readMessage() throws java.io.IOException, java.io.UnsupportedEncodingException {
    spirax.message.Message msg = null;
    java.lang.String stream = new java.io.BufferedReader(new java.io.InputStreamReader(socket.getInputStream(), "UTF-8")).readLine();
    if ((stream != null) && (!("".equals(stream)))) {
        msg = new spirax.message.Message(stream);
        if (debug) {
            java.lang.System.out.println(("Receiving: " + (msg.toString())));
        }
    }
    return msg;
}