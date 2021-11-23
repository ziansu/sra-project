@java.lang.Override
public android.support.v4.app.Fragment getItem(int position) {
    switch (position) {
        case 0 :
            return stepListFragment;
        case 1 :
            return ingredientListFragment;
        default :
            return null;
    }
}