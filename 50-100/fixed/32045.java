public void updateItem(org.cleantalk.app.model.RequestModel request) {
    for (int i = 0; i < (items_.size()); i++) {
        if (items_.get(i).getRequestId().equals(request.getRequestId())) {
            items_.set(i, request);
            notifyDataSetChanged();
            break;
        }
    }
}