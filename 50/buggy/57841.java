@java.lang.Override
public javafx.beans.value.ObservableValue<java.lang.String> call(javafx.scene.control.TableColumn.CellDataFeatures<com.dom.notificacao.model.entity.Notificacao, java.lang.String> n) {
    return new javafx.beans.property.SimpleObjectProperty<java.lang.String>(FORMART_BR.format(n.getValue().getPaciente().getDataNascimento()));
}