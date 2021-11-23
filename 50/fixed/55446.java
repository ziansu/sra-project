@java.lang.Override
public android.support.v4.app.Fragment getItem(int position) {
    return com.example.guest.coffeeShop.ui.CoffeeShopDetailFragment.newInstance(mCoffeeShops.get(position));
}