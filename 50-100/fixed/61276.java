@java.lang.Override
public void onClick(android.content.DialogInterface dialog, int which) {
    newReplyText = input.getText().toString();
    if (!(newReplyText.isEmpty())) {
        dataSource.open();
        replyList.add(dataSource.creatReply(newReplyText));
        listAdapter.notifyDataSetChanged();
        dataSource.close();
    }
}