@java.lang.Override
public void selectComponentView(ryrycipe.model.Component component) {
    for (ryrycipe.controller.ComponentViewController componentViewCtrl : componentViewControllerList) {
        if (componentViewCtrl.isSelected()) {
            componentViewCtrl.unselected();
        }else
            if (componentViewCtrl.getComponent().equals(component)) {
                componentViewCtrl.selected();
            }
        
    }
}