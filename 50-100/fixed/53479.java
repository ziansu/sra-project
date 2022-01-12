@java.lang.Override
public java.lang.String[] getNames() {
    int i = comboFeatureNames.getSelectedIndex();
    wekiinputhelper.Modifiers.FirstOrderDifference fod = new wekiinputhelper.Modifiers.FirstOrderDifference(w.getInputManager().getInputNames()[i], i, increment);
    java.lang.String[] names = new java.lang.String[1];
    names[0] = fod.getName();
    return names;
}