protected void useProgrammer(jmri.jmri.ProgListener p) throws jmri.ProgrammerException {
    if (((_usingProgrammer) != null) && ((_usingProgrammer) != p)) {
        if (jmri.implementation.OffsetHighCvProgrammerFacade.log.isInfoEnabled()) {
            jmri.implementation.OffsetHighCvProgrammerFacade.log.info(("programmer already in use by " + (_usingProgrammer)));
        }
        throw new jmri.implementation.jmri.ProgrammerException("programmer in use");
    }else {
        _usingProgrammer = p;
    }
}