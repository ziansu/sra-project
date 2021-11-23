@java.lang.Override
public void configure() throws java.lang.Exception {
    edu.stanford.rsl.conrad.phantom.AnalyticPhantom phantom = edu.stanford.rsl.conrad.phantom.AnalyticPhantom.getCurrentPhantom();
    com.jogamp.opencl.CLContext context = edu.stanford.rsl.conrad.opencl.OpenCLUtil.createContext();
    com.jogamp.opencl.CLDevice device = context.getMaxFlopsDevice();
    configure(phantom, context, device);
    generateMuMap(context, device);
    configured = true;
}