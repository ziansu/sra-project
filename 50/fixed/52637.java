public void notifyHoverListeners(netscape.javascript.JSObject obj) {
    net.java.html.plotlyjs.HoverEvent event = new net.java.html.plotlyjs.HoverEvent(this, this.shift, this.ctrl, obj);
    for (net.java.html.plotlyjs.ChartListener l : hoverListeners) {
        l.plotly_hover(event);
    }
}