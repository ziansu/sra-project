public void readMessage() throws java.lang.Exception {
    java.lang.System.out.println(current_offset);
    while ((current_offset) < (metaData.length)) {
        io.openmessaging.demo.DefaultBytesMessage msg = new io.openmessaging.demo.DefaultBytesMessage(null);
        readMessageHead();
        readBody(msg);
        while (((current_offset) - (previous_offset)) < (msg_length)) {
            readKeyValue(msg);
        } 
        previous_offset = current_offset;
        java.lang.System.out.println(msg);
        java.lang.System.out.println(("msg over current offset" + (current_offset)));
    } 
}