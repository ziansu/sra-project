public static java.util.ArrayList<eu.modelwriter.traceability.core.persistence.SigType> getSigTypeListByParentId(int id) {
    java.util.ArrayList<eu.modelwriter.traceability.core.persistence.SigType> suitableSigTypes = new java.util.ArrayList<>();
    org.eclipse.emf.common.util.EList<eu.modelwriter.traceability.core.persistence.SigType> sigTypes = eu.modelwriter.configuration.internal.AlloyUtilities.getSigTypes();
    for (eu.modelwriter.traceability.core.persistence.SigType sigType : sigTypes) {
        if ((sigType.getParentID()) == id) {
            suitableSigTypes.add(sigType);
        }
    }
    return suitableSigTypes;
}