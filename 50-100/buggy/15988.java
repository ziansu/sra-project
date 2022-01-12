private boolean hasErrorsImpl(java.util.Set<com.oracle.truffle.dsl.processor.model.MessageContainer> visitedSinks) {
    for (com.oracle.truffle.dsl.processor.model.MessageContainer.Message msg : getMessages()) {
        if ((msg.getKind()) == (javax.tools.Diagnostic.Kind.ERROR)) {
            return true;
        }
    }
    for (com.oracle.truffle.dsl.processor.model.MessageContainer sink : findChildContainers()) {
        if (visitedSinks.contains(sink)) {
            return false;
        }
        visitedSinks.add(sink);
        if (sink.hasErrorsImpl(visitedSinks)) {
            return true;
        }
    }
    return false;
}