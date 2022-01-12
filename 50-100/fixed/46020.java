@java.lang.Override
public void selectComponentView(ryrycipe.model.Component component) {
    for (ryrycipe.controller.ComponentViewController componentViewCtrl : componentViewControllerList) {
        if (componentViewCtrl.getComponent().equals(component)) {
            if (componentViewCtrl.isSelected()) {
                return ;
            }else {
                componentViewCtrl.selected();
            }
        }else
            if (componentViewCtrl.isSelected()) {
                componentViewCtrl.unselected();
            }
        
    }
}