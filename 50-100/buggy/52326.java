public java.util.List<hamr.core.general.bean.AnnotedBean> generate(java.lang.Object keyin, java.lang.Object valuein) {
    java.util.List<hamr.core.general.bean.AnnotedBean> ret = new java.util.ArrayList<hamr.core.general.bean.AnnotedBean>();
    java.lang.String[] vals = valuein.toString().split("###");
    hamr.examples.ipcount.IpCountBean bean = new hamr.examples.ipcount.IpCountBean();
    bean.setUrl(vals[1]);
    bean.setIp(vals[0]);
    return ret;
}