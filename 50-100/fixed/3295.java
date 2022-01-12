public java.lang.String render() {
    update();
    sb.setLength(0);
    renderProcessors();
    renderPhysicalMemory();
    renderSwap();
    renderHeap();
    renderNativeMemory();
    renderGc();
    renderLoad();
    renderThread();
    renderCluster();
    renderEvents();
    renderExecutors();
    renderOperationService();
    renderProxy();
    renderClient();
    renderConnection();
    return sb.toString();
}