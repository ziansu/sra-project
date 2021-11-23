private void setInterviewsParticipantIdAndIndex(final java.util.List<org.hmx.scitos.ais.domain.model.Interview> previousInterviews, final java.util.List<org.hmx.scitos.ais.domain.model.Interview> interviewsToAdd, final java.lang.String participantId) {
    int index;
    if (previousInterviews == null) {
        index = 1;
    }else {
        index = 1 + (previousInterviews.size());
    }
    for (final org.hmx.scitos.ais.domain.model.Interview singleAddition : interviewsToAdd) {
        singleAddition.setParticipantId(participantId);
        singleAddition.setIndex(index);
        index++;
    }
}