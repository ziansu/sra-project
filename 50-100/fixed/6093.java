@java.lang.Override
public void onPageSelected(int position) {
    andrzej.example.com.wordunscrambler.config.TabsConfig.CURRENT_TAB_NUM = position;
    switch (position) {
        case 0 :
            ((android.support.v7.app.AppCompatActivity) (getActivity())).getSupportActionBar().setTitle(R.string.unscrambler);
            break;
        case 1 :
            ((android.support.v7.app.AppCompatActivity) (getActivity())).getSupportActionBar().setTitle(R.string.dictionaries);
            break;
    }
}