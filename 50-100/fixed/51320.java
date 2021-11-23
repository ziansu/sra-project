public void remove(com.yeamy.daily.Adapter adapter, com.yeamy.daily.data.Mission mission) {
    java.util.ArrayList<com.yeamy.daily.data.Mission> data = this.data;
    int position = 0;
    for (com.yeamy.daily.data.Mission item : data) {
        if ((item._id) == (mission._id)) {
            break;
        }
        position++;
    }
    data.remove(position);
    adapter.notifyItemRemoved(position);
}