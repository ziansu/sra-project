@java.lang.Override
public void connect(interfaces.IElement element) {
    super.connect(element);
    if (element instanceof diagram.flowchart.FlowLine) {
        diagram.flowchart.FlowLine flow = ((diagram.flowchart.FlowLine) (element));
        if ((flow.checkConnected(this)) == (diagram.element.Line.CONNECTED_SRC)) {
            if ((this.flow) != null) {
                throw new exception.CreateElementException("Convergence can't have more than one children.");
            }else {
                this.flow = flow;
            }
        }
    }
}