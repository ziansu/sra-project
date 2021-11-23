public me.doubledutch.lazyjson.compressor.Template extractTemplate() {
    me.doubledutch.lazyjson.compressor.Template t = new me.doubledutch.lazyjson.compressor.Template();
    root.addSegments(cbuf, t);
    t.compact();
    return t;
}