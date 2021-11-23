@java.lang.Override
public void changed(javafx.beans.value.ObservableValue<? extends uk.ac.rdg.resc.cloudmask.CloudMaskController.MaskVariable> observable, uk.ac.rdg.resc.cloudmask.CloudMaskController.MaskVariable oldVal, uk.ac.rdg.resc.cloudmask.CloudMaskController.MaskVariable newVal) {
    if (newVal == null) {
        return ;
    }
    try {
        imageGenerator.setVariable(newVal.variableName.getValue());
        varLabel.textProperty().set(newVal.variableName.getValue());
        imageView.updateImage();
    } catch (uk.ac.rdg.resc.edal.exceptions.EdalException e) {
        e.printStackTrace();
    }
}