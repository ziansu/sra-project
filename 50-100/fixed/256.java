@java.lang.Override
public void onClick(android.view.View v) {
    if ((getAdapterPosition()) == (-1)) {
        return ;
    }
    if (SessionsViewActivity.act.getDeleteMode()) {
        SessionsViewActivity.act.insertToBeRemoved(getAdapterPosition());
        SessionsViewActivity.act.setUndoButton(true);
    }else {
        android.content.Intent intent = new android.content.Intent(com.inyourface.singbetter.RecordedSessions.SessionsViewActivity.act, com.inyourface.singbetter.RecordedSessions.ItemView.ItemActivity.class);
        int pos = getAdapterPosition();
        intent.putExtra("clickPosition", pos);
        SessionsViewActivity.act.startActivity(intent);
    }
}