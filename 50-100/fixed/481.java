@java.lang.Override
public void setEditedObject(org.openflexo.antar.binding.AbstractBinding object) {
    setEditedObject(object, true);
    if (object != null) {
        if ((object.getBindingDefinition()) != null) {
            setBindingDefinition(object.getBindingDefinition());
        }
        if ((object.getOwner()) != null) {
            setBindable(object.getOwner());
        }
    }
}