@java.lang.Override
public void onClick() {
    if ((mLayoutType) == (com.malalaoshi.android.fragments.main.ScheduleFragment.LayoutType.UNSIGNUP)) {
        com.malalaoshi.android.utils.AuthUtils.redirectLoginActivity(getContext());
    }else
        if ((mLayoutType) == (com.malalaoshi.android.fragments.main.ScheduleFragment.LayoutType.EMPTY)) {
            onClickEmptyCourse.onClickEmptyCourse(null);
        }
    
}