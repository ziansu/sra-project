@java.lang.Override
public void onClick(android.view.View v) {
    switch (v.getId()) {
        case R.id.m_toggle :
            ((com.hch.beautyenjoy.activity.MainActivity) (getActivity())).getSlidingPaneLayout().openPane();
            break;
        case R.id.loading_fail_bt :
            initDatas();
            break;
        default :
            break;
    }
}