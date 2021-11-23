private static void _handleNavigation(int container, int animIn, int animOut) {
    icarus.io.router.FragmentRouter.mAct.getSupportFragmentManager().beginTransaction().setCustomAnimations(animIn, animOut).replace(container, icarus.io.router.FragmentRouter.current).commit();
    if ((icarus.io.router.FragmentRouter.fragmentListener) != null)
        icarus.io.router.FragmentRouter.fragmentListener.onFragmentChanged(icarus.io.router.FragmentRouter.current);
    
}