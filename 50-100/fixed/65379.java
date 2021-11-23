private long hash(org.rapidoid.buffer.Buf buf, org.rapidoid.data.Range action, org.rapidoid.data.Range path) {
    return (((buf.get(action.start)) * 17) + ((action.length) * 19)) + (buf.get(path.start));
}