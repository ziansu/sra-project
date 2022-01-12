@android.support.annotation.RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
@java.lang.Override
public void onClick(android.view.View view) {
    voteYes.get(position).setImageResource(R.drawable.voteyes);
    voteNo.get(position).setImageResource(R.drawable.votenoselected);
    com.ajm3vn.austinm.politicalpollingapp.Util.DynamoBills.getInstance().updateBill(b, (-1), b.getLocalVote(), context);
    b.setLocalVote((-1));
    db.updateBill(b);
}