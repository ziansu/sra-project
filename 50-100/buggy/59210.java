public java.util.List<edu.scripps.yates.shared.model.PSMBean> getPsms(int start, int end) {
    if (getPsms().isEmpty())
        return psms;
    
    if (end > (psms.size()))
        end = psms.size();
    
    return psms.subList(start, end);
}