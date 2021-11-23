@java.lang.Override
public org.corpus_tools.salt.common.STimelineRelation createTimelineRelation(org.corpus_tools.salt.common.SToken token, int timeSteps) {
    org.corpus_tools.salt.common.STimeline timeline = getTimeline();
    int timelineEnd = ((timeline.getEnd()) == null) ? 0 : timeline.getEnd();
    org.corpus_tools.salt.common.STimelineRelation timeLineRel = org.corpus_tools.salt.SaltFactory.createSTimelineRelation();
    timeLineRel.setSource(token);
    timeLineRel.setTarget(timeline);
    timeLineRel.setStart(timeline.getEnd());
    timeLineRel.setEnd((timelineEnd += timeSteps));
    addRelation(timeLineRel);
    return timeLineRel;
}