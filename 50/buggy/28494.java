@java.lang.Override
public void onSimpleClick() {
    super.onSimpleClick();
    explorerService.toggleSelection(((ijfx.ui.explorer.Explorable) (getItem())));
}