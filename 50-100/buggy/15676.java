@java.lang.Override
public void connect(interfaces.IElement element) {
    if ((this.flow) != null) {
        throw new exception.CreateElementException("Convergence can't have more than one children.");
    }
    super.connect(element);
    if (element instanceof diagram.flowchart.FlowLine) {
        diagram.flowchart.FlowLine flow = ((diagram.flowchart.FlowLine) (element));
        if ((flow.checkConnected(this)) == (diagram.element.Line.CONNECTED_SRC)) {
            this.flow = flow;
        }
    }
}