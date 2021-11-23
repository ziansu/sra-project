@java.lang.Override
public void stop() {
    super.stop();
    if (usePathFinder)
        ePath.clear();
    
    followExactPath = false;
}