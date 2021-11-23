@java.lang.Override
public boolean isShowMenu() {
    boolean showMenu = super.isShowMenu();
    if (showMenu && ((org.talend.dataprofiler.core.CorePlugin.getDefault().getSemanticStudioService()) == null)) {
        return false;
    }
    return showMenu;
}