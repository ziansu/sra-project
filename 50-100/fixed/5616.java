@java.lang.Override
public void cardSwipedRight(int position) {
    android.util.Log.i("MainActivity", ("card was swiped right, position in adapter: " + position));
    com.example.rvkdt.rvkapp.DataObjects.Bar bar = barManager.getBar();
    if (bar != null) {
        barManager.pushLiked(currentBar);
        currentBar = barManager.popDeck();
        update();
        barManager.pushToDeck(bar);
        bars.add(bar);
    }
}