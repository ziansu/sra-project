@org.checkerframework.checker.nullness.qual.NonNull
@java.lang.Override
public org.swrlapi.drools.owl.classes.CE convert(org.swrlapi.builtins.arguments.SWRLClassExpressionBuiltInArgument argument) {
    org.semanticweb.owlapi.model.OWLClassExpression classExpression = argument.getOWLClassExpression();
    return getDroolsOWLClassExpression2CEConverter().convert(classExpression);
}