@java.lang.Override
public void visitImpl(edu.harvard.iq.datatags.model.graphs.nodes.CallNode cn) throws edu.harvard.iq.datatags.runtime.exceptions.DataTagsRuntimeException {
    if ((chart.getNode(cn.getCalleeNodeId())) == null) {
        validationMessages.add(new edu.harvard.iq.datatags.tools.NodeValidationMessage(edu.harvard.iq.datatags.tools.ValidationMessage.Level.ERROR, (("Call node \"" + cn) + "\" calls nonexistent node.")));
    }
}