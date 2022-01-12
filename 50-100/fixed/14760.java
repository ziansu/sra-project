public static com.handup.handup.controller.course.content.ContentFragment newInstance(float dpWidth, float density) {
    com.handup.handup.controller.course.content.ContentFragment fragment = new com.handup.handup.controller.course.content.ContentFragment();
    android.os.Bundle args = new android.os.Bundle();
    args.putInt(com.handup.handup.controller.course.content.ContentFragment.ARG_SCREEN_WIDTH, ((int) (dpWidth * density)));
    args.putInt(com.handup.handup.controller.course.content.ContentFragment.ARG_COLUMN_COUNT, 1);
    args.putFloat(com.handup.handup.controller.course.content.ContentFragment.ARG_SCREEN_DESNITY, density);
    fragment.setArguments(args);
    return fragment;
}