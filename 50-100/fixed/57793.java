@java.lang.Override
public void onClick(android.view.View v) {
    java.lang.String idStr = ((android.widget.TextView) (v.findViewById(R.id.nfn_id))).getText().toString();
    android.content.Intent i;
    if ((appNo) == 1) {
        i = new android.content.Intent(context, in.andonsystem.activity.v2.IssueDetailActivity.class);
    }else {
        i = new android.content.Intent(context, in.andonsystem.activity.v2.IssueDetailActivity.class);
    }
    i.putExtra("issueId", java.lang.Long.parseLong(idStr));
    context.startActivity(i);
}