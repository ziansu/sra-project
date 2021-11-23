@java.lang.Override
public org.eclipse.emf.common.util.EList<org.osate.aadl2.Classifier> getSelfPlusAllExtended() {
    final org.eclipse.emf.common.util.EList<org.osate.aadl2.Classifier> result = new org.eclipse.emf.common.util.BasicEList<org.osate.aadl2.Classifier>();
    org.osate.aadl2.Classifier current = this;
    do {
        result.add(current);
        current = current.getExtended();
    } while ((current != null) && (current != (this)) );
    return result;
}