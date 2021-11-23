public void parameterChanged(org.jactr.core.event.IParameterEvent pe) {
    if (((org.jactr.core.chunk.ISubsymbolicChunk) (pe.getSource())).getParentChunk().isEncoded())
        if (pe.getParameterName().equalsIgnoreCase(ISubsymbolicChunk4.LINKS))
            checkLinks(((org.jactr.core.chunk.ISubsymbolicChunk) (pe.getSource())));
        
    
}