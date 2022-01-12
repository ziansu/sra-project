@java.lang.Override
public void add(com.mygdx.game.model.characters.ShopOpenListener listener) {
    if (!(listeners.contains(listener))) {
        listeners.add(listener);
    }
}