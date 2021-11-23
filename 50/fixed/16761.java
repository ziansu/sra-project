public void removeNameAtPosition(int index) {
    content.remove(index);
    notifyDataSetChanged();
    setNoContent();
}