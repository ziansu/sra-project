@java.lang.Override
public javafx.collections.ObservableList<javafx.beans.property.Property<? extends java.lang.Object>> getFields() {
    javafx.collections.ObservableList<javafx.beans.property.Property<? extends java.lang.Object>> fields = super.getFields();
    fields.add(this.layoutXProperty());
    fields.add(this.layoutYProperty());
    return fields;
}