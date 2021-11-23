public static org.gdg.frisbee.android.chapter.ChapterSelectDialog newInstance(@android.support.annotation.Nullable
org.gdg.frisbee.android.api.model.Chapter selectedChapter) {
    org.gdg.frisbee.android.chapter.ChapterSelectDialog fragment = new org.gdg.frisbee.android.chapter.ChapterSelectDialog();
    android.os.Bundle args = new android.os.Bundle(2);
    args.putParcelable(org.gdg.frisbee.android.chapter.ChapterSelectDialog.EXTRA_SELECTED_CHAPTER, selectedChapter);
    fragment.setArguments(args);
    return fragment;
}