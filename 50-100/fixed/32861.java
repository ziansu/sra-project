@java.lang.Override
protected org.modeldriven.alf.syntax.expressions.impl.ElementReference deriveType() {
    org.modeldriven.alf.syntax.expressions.impl.ElementReference referent = this.getSelf().getReferent();
    if ((referent != null) && (referent.getImpl().isClassifier())) {
        return referent;
    }else {
        return referent == null ? null : referent.getImpl().getNamespace();
    }
}