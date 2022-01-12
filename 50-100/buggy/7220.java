private <F extends com.evolveum.midpoint.xml.ns._public.common.common_3.FocusType> void checkExclusion(com.evolveum.midpoint.model.impl.lens.projector.EvaluatedAssignmentImpl<F> assignmentA, com.evolveum.midpoint.model.impl.lens.projector.EvaluatedAssignmentImpl<F> assignmentB, com.evolveum.midpoint.model.impl.lens.projector.EvaluatedAssignmentTargetImpl roleA, com.evolveum.midpoint.model.impl.lens.projector.EvaluatedAssignmentTargetImpl roleB) throws com.evolveum.midpoint.util.exception.PolicyViolationException {
    checkExclusionOneWayLegacy(assignmentA, assignmentB, roleA, roleB);
    checkExclusionOneWayLegacy(assignmentA, assignmentB, roleB, roleA);
    checkExclusionOneWayRuleBased(assignmentA, assignmentB, roleA, roleB);
    checkExclusionOneWayRuleBased(assignmentA, assignmentB, roleB, roleA);
}