@java.lang.Override
public void onEnter(com.oracle.truffle.api.instrumentation.EventContext context, com.oracle.truffle.api.frame.VirtualFrame frame) {
    if (!(disabled())) {
        com.oracle.truffle.api.CompilerDirectives.transferToInterpreter();
        clearStepInstrument();
        com.oracle.truffle.r.runtime.nodes.RBaseNode node = ((com.oracle.truffle.r.runtime.nodes.RBaseNode) (context.getInstrumentedNode()));
        if (node.isTaggedWith(StandardTags.RootTag.class)) {
            return ;
        }
        com.oracle.truffle.r.nodes.builtin.helpers.DebugHandling.printNode(node, false);
        browserInteract(node, frame);
    }
}