public static io.github.hkust1516csefyp43.easymed.view.fragment.patient_visit_edit.DocumentFragment newInstance(java.lang.String patientId, java.lang.Integer whichDocument) {
    io.github.hkust1516csefyp43.easymed.view.fragment.patient_visit_edit.DocumentFragment fragment = new io.github.hkust1516csefyp43.easymed.view.fragment.patient_visit_edit.DocumentFragment();
    android.os.Bundle args = new android.os.Bundle();
    args.putString(io.github.hkust1516csefyp43.easymed.view.fragment.patient_visit_edit.DocumentFragment.key1, patientId);
    args.putInt(io.github.hkust1516csefyp43.easymed.view.fragment.patient_visit_edit.DocumentFragment.key2, whichDocument);
    fragment.setArguments(args);
    return fragment;
}