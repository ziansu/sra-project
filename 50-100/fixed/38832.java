public void notifyStickyRemove(com.taobao.weex.ui.component.list.WXCell component) {
    if (component == null)
        return ;
    
    if (((!(headComponentStack.isEmpty())) && (!(headerViewStack.isEmpty()))) && (!(tempViewStack.isEmpty()))) {
        removeSticky(component);
    }
}