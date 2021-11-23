private void fetchPrescriptions() {
    pList = ng.softworks.unorthodox.medstrackr.Helpers.PrescriptionsDBHelper.getInstance(this.getActivity()).getAllPrescriptions();
}