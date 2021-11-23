public void remove() {
    channelList.remove(remove_position);
    remove_position = -1;
    notifyDataSetChanged();
}