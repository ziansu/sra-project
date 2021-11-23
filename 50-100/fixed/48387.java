@java.lang.Override
public yalantis.com.sidemenu.interfaces.ScreenShotable onSwitch(yalantis.com.sidemenu.interfaces.Resourceble slideMenuItem, yalantis.com.sidemenu.interfaces.ScreenShotable screenShotable, int position) {
    android.util.Log.v(LOG_TAG, ("" + position));
    switch (slideMenuItem.getName()) {
        case map.minimap.mainMenuComponents.ContentFragment.CLOSE :
            return screenShotable;
        default :
            android.util.Log.v(LOG_TAG, ("Name = " + (slideMenuItem.getName())));
            return replaceFragment(screenShotable, slideMenuItem.getName());
    }
}