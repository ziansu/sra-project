@java.lang.Override
public void onPageSelected(int position) {
    com.project.gu.testnestedscrollingfirst.log.LogUtil.log("onPageSelected ----");
    getTopView().setVisibility(View.INVISIBLE);
}