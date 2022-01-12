protected long getDurationOfTrace(java.util.List<org.ahp.structure.ZipkinSpan> spans) {
    for (org.ahp.structure.ZipkinSpan zipkinSpan : spans) {
        if ((zipkinSpan.getParent_id()) == 0) {
            return zipkinSpan.getDuration();
        }
    }
    return 0;
}