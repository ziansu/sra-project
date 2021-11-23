@java.lang.Override
public void onNewMessageReceived() {
    if ((currentIndex) != 3)
        tabViewItems.get(3).showLittleRedDot();
    
}