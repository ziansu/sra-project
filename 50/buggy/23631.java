public void mapCommonTimeLine2STimeine(de.hu_berlin.german.korpling.saltnpepper.misc.exmaralda.CommonTimeLine eTimeLine, org.corpus_tools.salt.common.STimeline sTimeLine) {
    for (de.hu_berlin.german.korpling.saltnpepper.misc.exmaralda.TLI tli : eTimeLine.getTLIs()) {
        if ((tli.getTime()) == null) {
            sTimeLine.increasePointOfTime();
        }
    }
}