public java.lang.String[] getPacket() throws java.io.IOException {
    while (input.ready()) {
        char c = ((char) (input.read()));
        if (c == '\n') {
            java.lang.String output = buffer;
            buffer = "";
            return output.split("\t");
        }else
            buffer += c;
        
    } 
    return null;
}