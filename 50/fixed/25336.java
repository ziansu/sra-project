@java.lang.Override
public android.support.v4.app.Fragment getItem(int position) {
    switch (position) {
        case 0 :
            return new cn.ucai.fulicenter.fragments.NewGoodsFragment();
        case 1 :
            return new cn.ucai.fulicenter.fragments.BoutiqueFragment();
        case 2 :
            return new cn.ucai.fulicenter.fragments.CategoryFragment();
        default :
            return new cn.ucai.fulicenter.fragments.NewGoodsFragment();
    }
}