protected void checkProgramArgsKey(de.tum.in.niedermr.ta.runner.execution.args.ProgramArgsKey key) {
    if (!(key.isForProgramClass(m_programClass))) {
        throw new java.lang.IllegalArgumentException(("Key is not suitable for " + (m_programClass.getName())));
    }
    if ((key.getIndex()) >= (m_args.length)) {
        throw new java.lang.IllegalArgumentException(("Index is out of range: " + (key.getIndex())));
    }
}