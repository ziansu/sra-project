@java.lang.Override
public void onClick(android.view.View view) {
    if ((up_Arrow.getVisibility()) == (android.view.View.VISIBLE)) {
        java.lang.String click_id = ((java.lang.String) (view.getTag()));
        location_database.submit_vote(view_page.get_location(), click_id, (+1));
        team11.crowded.CustomAdapter.changeVoteInPost(post_info, (+1));
        up_Arrow.setVisibility(View.INVISIBLE);
        down_Arrow.setVisibility(View.VISIBLE);
    }
}