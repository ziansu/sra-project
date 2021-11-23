public void addIptables(long ipStart, long ipEnd) {
    com.obsidian.octopus.vulcan.interceptor.InterceptorIpFilter.IpObject object = new com.obsidian.octopus.vulcan.interceptor.InterceptorIpFilter.IpObject();
    object.ipStart = ipStart;
    object.ipEnd = ipEnd;
    synchronized(list) {
        list.add(object);
    }
}