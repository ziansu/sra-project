@java.lang.Override
public int getItemViewType(int position) {
    io.videtur.ignis.model.Message message = getItem(position);
    if (message.getSenderKey().equals(mUserKey)) {
        return io.videtur.ignis.core.Constants.MESSAGE_FROM_USER;
    }else {
        return io.videtur.ignis.core.Constants.MESSAGE_TO_USER;
    }
}