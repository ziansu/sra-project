public void updateAnEventAt(com.canyapan.dietdiaryapp.models.Event updatedEvent, int position) {
    if (null != (mAdapter)) {
        mAdapter.updateAnEventAt(updatedEvent, position);
    }
}