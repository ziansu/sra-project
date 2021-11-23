@java.lang.Override
public java.lang.String getText(java.lang.Object object) {
    org.osate.aadl2.instance.FeatureInstance fi = ((org.osate.aadl2.instance.FeatureInstance) (object));
    java.lang.String label = fi.getFullName();
    java.lang.String ftype = fi.getCategory().getName();
    return ((ftype == null) || ((ftype.length()) == 0) ? getString("_UI_FeatureInstance_type") : ftype + " instance") + ((label == null) || ((label.length()) == 0) ? "" : " " + label);
}