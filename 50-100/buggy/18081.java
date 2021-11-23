public void setMemberCallings(java.util.List<org.ldscd.callingworkflow.model.Calling> callings) {
    for (org.ldscd.callingworkflow.model.Calling calling : callings) {
        if (((calling.getMemberId()) != null) && ((calling.getMemberId()) > 0)) {
            getMember(calling.getMemberId()).setCurrentCallings(calling);
        }
    }
}