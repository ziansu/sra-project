public void remove() {
    android.util.Log.d("info", "food item remove called");
    store.remove(this);
    if ((layout.getContext()) instanceof overlandthomas.shopinglistalpha.Rmove) {
        android.util.Log.d("info", "food item rmove true");
        ((overlandthomas.shopinglistalpha.Rmove) (layout.getContext())).remove(this);
    }
}