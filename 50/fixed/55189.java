@java.lang.Override
public android.support.v4.app.Fragment getItem(int position) {
    if ((categorys) == null) {
        return null;
    }
    return com.wole.story.ui.fragment.TestFragment.newInstance(categorys.get(position).getType());
}