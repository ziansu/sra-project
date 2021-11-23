@org.junit.Test
public void test_should_call_onViewReady_with_pops_out_on_home_page_on_back_navigation() throws java.lang.Throwable {
    navigationManager.navigate(this).to(com.shipdream.lib.android.mvc.view.viewpager.SubFragment.class.getSimpleName());
    waitTest(1200);
    lifeCycleValidator.reset();
    navigationManager.navigate(this).back();
    waitTest(1200);
    lifeCycleValidator.expect(LifeCycle.onCreateViewNull, LifeCycle.onViewCreatedNull, LifeCycle.onViewReadyPopOut, LifeCycle.onPoppedOutToFront);
}