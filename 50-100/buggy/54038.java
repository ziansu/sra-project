@java.lang.Override
public java.util.EnumSet<de.uni_freiburg.informatik.ultimate.modelcheckerutils.smt.predicates.CallReturnPyramideInstanceProvider.Instance> getInstancesGlobalNonOld(final de.uni_freiburg.informatik.ultimate.modelcheckerutils.cfg.variables.IProgramNonOldVar pv) {
    if (isModifiableByCallee(pv)) {
        return java.util.EnumSet.of(de.uni_freiburg.informatik.ultimate.modelcheckerutils.smt.predicates.CallReturnPyramideInstanceProvider.Instance.AFTER_RETURN);
    }else {
        if (isWrittenOnReturn(pv)) {
            return java.util.EnumSet.of(de.uni_freiburg.informatik.ultimate.modelcheckerutils.smt.predicates.CallReturnPyramideInstanceProvider.Instance.AFTER_RETURN);
        }else {
            return java.util.EnumSet.of(de.uni_freiburg.informatik.ultimate.modelcheckerutils.smt.predicates.CallReturnPyramideInstanceProvider.Instance.BEFORE_CALL, de.uni_freiburg.informatik.ultimate.modelcheckerutils.smt.predicates.CallReturnPyramideInstanceProvider.Instance.AFTER_CALL, de.uni_freiburg.informatik.ultimate.modelcheckerutils.smt.predicates.CallReturnPyramideInstanceProvider.Instance.BEFORE_RETURN, de.uni_freiburg.informatik.ultimate.modelcheckerutils.smt.predicates.CallReturnPyramideInstanceProvider.Instance.AFTER_RETURN);
        }
    }
}