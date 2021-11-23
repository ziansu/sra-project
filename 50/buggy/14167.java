@java.lang.Override
protected boolean isValidWithComm(edu.jhu.hlt.concrete.Communication c) {
    return new edu.jhu.hlt.concrete.communications.SectionedSuperCommunication(c).getSectionIdToSectionMap().keySet().contains(this.annotation.getSentenceId());
}