public void bindData(com.taobao.weex.ui.component.WXComponent component) {
    if (!(isLazy())) {
        if (component == null) {
            component = this;
        }
        updateProperties(component.getDomObject().getStyles());
        updateProperties(component.getDomObject().getAttrs());
        updateExtra(component.getDomObject().getExtra());
    }
}