@java.lang.SuppressWarnings(value = { "unused" })
public com.lazyframework.standalone.filebrowser.FileBrowserRunnable.FileBrowseParamBuilder addSuffixFilter(java.lang.String suffix) {
    if (!(android.text.TextUtils.isEmpty(suffix))) {
        if ((param.suffixFilterMap) == null) {
            param.suffixFilterMap = new java.util.HashMap<>();
        }
        param.suffixFilterMap.put(suffix, true);
    }
    return this;
}