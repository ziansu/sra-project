@java.lang.Override
public int compare(com.zzzmode.appopsx.ui.model.AppInfo o1, com.zzzmode.appopsx.ui.model.AppInfo o2) {
    return java.lang.Long.compare(java.lang.Math.max(o2.installTime, o2.updateTime), java.lang.Math.max(o1.installTime, o1.updateTime));
}