@java.lang.Override
public void onAnimationEnd(android.animation.Animator animation) {
    setStatus(com.developer.paul.itimerecycleviewgroup.ITimeRecycleViewGroup.STOP);
    if ((onScroll) != null) {
        com.developer.paul.itimerecycleviewgroup.AwesomeViewGroup a = getFirstShownAwesomeViewGroup(awesomeViewGroupList);
        com.developer.paul.itimerecycleviewgroup.AwesomeViewGroup.AwesomeLayoutParams lp = ((com.developer.paul.itimerecycleviewgroup.AwesomeViewGroup.AwesomeLayoutParams) (a.getLayoutParams()));
        com.developer.paul.itimerecycleviewgroup.LogUtil.log("postcheck : index : ", (((((a.getInRecycledViewIndex()) + " l : ") + (lp.left)) + " r : ") + (lp.right)));
        onScroll.onPageSelected(getFirstShowItem());
    }
}