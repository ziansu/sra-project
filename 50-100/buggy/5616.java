@java.lang.Override
public void cardSwipedRight(int position) {
    android.util.Log.i("MainActivity", ("card was swiped right, position in adapter: " + position));
    com.example.rvkdt.rvkapp.DataObjects.Bar likedBar = bars.get(position);
    barManager.pushLiked(likedBar);
    liked_bars_fragment.update();
    com.example.rvkdt.rvkapp.DataObjects.Bar bar = barManager.getBar();
    if (bar != null) {
        currentBar = barManager.popDeck();
        barManager.pushToDeck(bar);
        bars.add(bar);
    }
}