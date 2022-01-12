@java.lang.Override
public org.jactr.tools.grapher.core.container.IProbeContainer install(org.jactr.core.chunk.IChunk element, org.jactr.tools.grapher.core.container.IProbeContainer container) {
    org.jactr.tools.grapher.core.container.IProbeContainer rtnContainer = super.install(element, container);
    java.util.concurrent.Executor executor = org.jactr.core.concurrent.ExecutorServices.INLINE_EXECUTOR;
    element.addListener(_pListener, executor);
    element.addListener(_cListener, executor);
    if (element.isEncoded())
        checkLinks(element);
    
    return rtnContainer;
}