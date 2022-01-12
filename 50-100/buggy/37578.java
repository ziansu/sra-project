@java.lang.Override
public void onActivityResult(int requestCode, int resultCode, android.content.Intent data) {
    super.onActivityResult(requestCode, resultCode, data);
    if (requestCode == (com.padc.interactive_training.activities.RegisteredCourseDetailActivity.RC_COURSE_FLOW)) {
        if (((com.padc.interactive_training.data.models.CourseModel.getInstance().getChapterListData()) != null) && ((chapterListFragment) != null))
            chapterListFragment.chapterAdapter.setNewData(com.padc.interactive_training.data.models.CourseModel.getInstance().getChapterListData());
        
    }
}