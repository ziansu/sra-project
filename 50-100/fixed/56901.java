@java.lang.Override
public void setEditedObject(org.openflexo.connie.DataBinding dataBinding) {
    if (dataBinding == null) {
        return ;
    }
    setEditedObject(dataBinding, true);
    if ((dataBinding != null) && (dataBinding.isValid(true))) {
        isConnected = true;
    }
    if (dataBinding != null) {
        if ((dataBinding.getOwner()) != null) {
            setBindable(dataBinding.getOwner());
        }
    }
}