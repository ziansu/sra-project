public void updateItem(org.cleantalk.app.model.RequestModel request) {
    int result = java.util.Collections.binarySearch(items_, request, new java.util.Comparator<org.cleantalk.app.model.RequestModel>() {
        @java.lang.Override
        public int compare(org.cleantalk.app.model.RequestModel requestModel, org.cleantalk.app.model.RequestModel t1) {
            return requestModel.getRequestId().compareTo(t1.getRequestId());
        }
    });
    if (result >= 0) {
        items_.set(result, request);
        notifyDataSetChanged();
    }
}