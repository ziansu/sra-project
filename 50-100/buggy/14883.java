@java.lang.Override
protected void onPostExecute(org.apache.commons.lang3.tuple.Triple<org.ei.opensrp.domain.Weight, java.util.List<org.ei.opensrp.domain.Vaccine>, java.util.List<org.ei.opensrp.domain.Alert>> triple) {
    hideProgressDialog();
    updateRecordWeightView(triple.getLeft());
    updateServiceViews(triple.getMiddle(), triple.getRight());
    updateVaccinationViews(triple.getMiddle(), triple.getRight());
    performRegisterActions(registerClickables);
}