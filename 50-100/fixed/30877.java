public void setTextName() {
    roomString = queue.get(roomNum);
    if (!(roomString.equals("empty"))) {
        textName.setText(getRoomName(queue.get(roomNum)).toUpperCase());
    }else {
        textName.setText(queue.get(roomNum).toUpperCase());
    }
}