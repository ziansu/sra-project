@java.lang.Override
public void onChanged(javafx.collections.ListChangeListener.Change<? extends wormguides.model.Rule> change) {
    while (change.next()) {
        for (wormguides.model.Rule rule : change.getAddedSubList()) {
            rule.getRuleChangedProperty().addListener(new javafx.beans.value.ChangeListener<java.lang.Boolean>() {
                @java.lang.Override
                public void changed(javafx.beans.value.ObservableValue<? extends java.lang.Boolean> observable, java.lang.Boolean oldValue, java.lang.Boolean newValue) {
                    if (newValue)
                        buildScene(time.get());
                    
                }
            });
        }
    } 
}