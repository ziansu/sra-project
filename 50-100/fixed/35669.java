private java.util.List<Kwsn.Link> getChannelFromClip() {
    java.util.List<Kwsn.Link> list = new java.util.ArrayList<>();
    for (editor.canvas.Clip c : this.originChannelClip) {
        Kwsn.Link l = new Kwsn.Link();
        l.id = c.getId();
        l.From = c.getOutputPlace().getId();
        l.To = c.getInputPlace().getId();
        list.add(l);
    }
    return list;
}