@java.lang.Override
public void onClick(android.view.View v) {
    int discussionCount = step.getDiscussions_count();
    analytic.reportEvent(Analytic.Comments.OPEN_FROM_STEP_UI);
    if (discussionCount == 0) {
        screenManager.openComments(getContext(), step.getDiscussion_proxy(), step.getId(), true);
    }else {
        screenManager.openComments(getContext(), step.getDiscussion_proxy(), step.getId());
    }
}