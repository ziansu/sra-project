@java.lang.Override
public void setValueFromComponent(net.sf.mzmine.parameters.parametertypes.filenames.FileNameComponent component) {
    java.io.File compValue = component.getValue();
    if ((extension) != null) {
        if (!(compValue.getName().endsWith(extension)))
            compValue = new java.io.File((((compValue.getPath()) + ".") + (extension)));
        
    }
    this.value = compValue;
}