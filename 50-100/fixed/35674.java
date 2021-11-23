public static void main(java.lang.String[] args) throws java.io.IOException {
    int threadNum = 500;
    java.lang.String saveIPProxysPath = com.github.water.csdn.constant.Constants.IP_PROXY_DB;
    java.lang.String saveBlogsPath = com.github.water.csdn.constant.Constants.BLOG_LIST_DB;
    java.lang.String blogMasterName = "wantaway314";
    com.github.water.csdn.bean.BlogsAndIPs blogsAndIPs = null;
    blogsAndIPs = com.github.water.csdn.MainCSDN.getDataFromLocal(saveIPProxysPath, saveBlogsPath);
    com.github.water.csdn.MainCSDN.startBrush(blogsAndIPs.getIpProxylist(), blogsAndIPs.getBloglist(), threadNum);
}