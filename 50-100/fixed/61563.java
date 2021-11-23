@java.lang.Override
public android.support.v4.app.Fragment getItem(int index) {
    switch (index) {
        case 0 :
            return com.daviancorp.android.ui.list.MonsterGridFragment.newInstance("Large");
        case 1 :
            return com.daviancorp.android.ui.list.MonsterGridFragment.newInstance("Small");
        case 2 :
            return com.daviancorp.android.ui.list.MonsterGridFragment.newInstance(null);
        default :
            return null;
    }
}