public void addMessage(io.github.jason1114.lovenote.bean.MessageBean message) {
    long timestamp = message.getMills();
    if ((mData.size()) == 0) {
        mData.add(message);
        return ;
    }
    for (int i = 0; i < (mData.size()); i++) {
        if (timestamp >= (mData.get(i).getMills())) {
            mData.add(i, message);
            break;
        }
    }
}