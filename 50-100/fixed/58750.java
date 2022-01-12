@java.lang.Override
protected Projection.Inclusion projectArray(com.redhat.lightblue.util.Path p, com.redhat.lightblue.eval.QueryEvaluationContext ctx) {
    com.redhat.lightblue.eval.ArrayQueryProjector.LOGGER.debug("Evaluating array query projection for {}", p);
    com.redhat.lightblue.util.Path contextRoot = ctx.getPath();
    com.redhat.lightblue.eval.QueryEvaluationContext nestedContext = ctx.getNestedContext((contextRoot.isEmpty() ? p : p.suffix((-(contextRoot.numSegments())))));
    if (query.evaluate(nestedContext)) {
        com.redhat.lightblue.eval.ArrayQueryProjector.LOGGER.debug("query evaluates to true");
        return isIncluded() ? Projection.Inclusion.explicit_inclusion : Projection.Inclusion.explicit_exclusion;
    }
    return isIncluded() ? Projection.Inclusion.explicit_exclusion : Projection.Inclusion.explicit_inclusion;
}