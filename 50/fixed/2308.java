@java.lang.Override
public android.support.v4.app.Fragment getItem(int position) {
    return com.kosbrother.mongmongwoo.fragments.ProductImageFragment.newInstance(urls.get(position), position);
}