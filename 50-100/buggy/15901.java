static void Consume(java.io.PrintWriter output) {
    if ((buffer.Buffer.index_buffer) == (-1))
        output.println(buffer.Buffer.Response.FAILURE_EMPTY_BUFFER.toString());
    else {
        output.println(buffer.Buffer.Response.SUCCESS.toString());
        if ((buffer.Buffer.index_buffer) == (buffer.Buffer.BUFFER_SIZE))
            output.println(buffer.Buffer.buffer[(--(buffer.Buffer.index_buffer))]);
        else
            output.println(buffer.Buffer.buffer[((buffer.Buffer.index_buffer)--)]);
        
    }
}