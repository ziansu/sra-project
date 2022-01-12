@java.lang.Override
public void onResume() {
    super.onResume();
    l("onResume");
    if (!(init)) {
        if ((initState) == (me.ykrank.androidlifecycle.event.InitSate.RESUMED)) {
            init = true;
            return ;
        }
        init = true;
    }
    if ((lifeCycle) != null) {
        lifeCycle.onResume();
    }
}