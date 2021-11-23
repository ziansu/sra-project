public javaee.bean.ResumeChunk get(javax.servlet.http.HttpServletRequest request) {
    java.lang.String id = ((request.getParameter("resumableIdentifier")) + "_") + (request.getParameter("resumableChunkNumber"));
    javaee.bean.ResumeChunk chunk = javaee.bean.ResumeStorage.chunks.get(id);
    synchronized(this) {
        if (chunk == null) {
            chunk = new javaee.bean.ResumeChunk();
            javaee.bean.ResumeStorage.chunks.put(id, chunk);
        }
    }
    chunk.setFieldByRequest(request);
    java.lang.System.err.printf("have got chunk: %s\n", id);
    return chunk;
}