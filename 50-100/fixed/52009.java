@java.lang.Override
public void onClick(android.view.View v) {
    if (unlike_button.isChecked()) {
        unlike_button.setChecked(false);
        resource.setDownVote(((resource.getDownVote()) - 1));
    }else {
        if (like_button.isChecked()) {
            resource.setUpVote(((resource.getUpVote()) + 1));
        }else {
            resource.setUpVote(((resource.getUpVote()) - 1));
        }
    }
    updateLikeValues();
}