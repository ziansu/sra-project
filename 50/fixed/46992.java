@java.lang.Override
public boolean isShowMenu() {
    if ((org.talend.dataprofiler.core.CorePlugin.getDefault().getSemanticStudioService()) == null) {
        return false;
    }
    return super.isShowMenu();
}