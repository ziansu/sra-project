public void setSelected(boolean selected) {
    if (selected) {
        if ((org.scilab.modules.xcos.palette.PaletteBlockCtrl.previouslySelected) != null) {
            org.scilab.modules.xcos.palette.PaletteBlockCtrl.previouslySelected.setSelected(false);
        }
        org.scilab.modules.xcos.palette.PaletteBlockCtrl.previouslySelected = this;
        getView().requestFocus();
        getView().setStatusUI(StatusUI.SELECTED);
    }else {
        org.scilab.modules.xcos.palette.view.PaletteManagerView.get().getPanel().requestFocus();
        getView().setStatusUI(StatusUI.NON_SELECTED);
    }
}