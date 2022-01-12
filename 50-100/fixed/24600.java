private void initBanners() {
    if (com.example.stream.eb.launcher.LauncherScrollDelegate.INTEGERS.isEmpty()) {
        com.example.stream.eb.launcher.LauncherScrollDelegate.INTEGERS.add(R.mipmap.launcher_01);
        com.example.stream.eb.launcher.LauncherScrollDelegate.INTEGERS.add(R.mipmap.launcher_02);
        com.example.stream.eb.launcher.LauncherScrollDelegate.INTEGERS.add(R.mipmap.launcher_03);
        com.example.stream.eb.launcher.LauncherScrollDelegate.INTEGERS.add(R.mipmap.launcher_04);
        com.example.stream.eb.launcher.LauncherScrollDelegate.INTEGERS.add(R.mipmap.launcher_05);
    }
    mConvenientBanner.setPages(new com.example.stream.core.ui.launcher.LauncherHolderCreator(), com.example.stream.eb.launcher.LauncherScrollDelegate.INTEGERS).setPageIndicator(new int[]{ R.drawable.dot_normal , R.drawable.dot_focus }).setPageIndicatorAlign(ConvenientBanner.PageIndicatorAlign.CENTER_HORIZONTAL).setOnItemClickListener(this).setCanLoop(false);
}