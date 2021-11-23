@java.lang.Override
public android.support.v4.app.Fragment getItem(int position) {
    return com.laudandjolynn.mytv.ProgramTableFragment.newInstance(getPageTitle(position).toString(), date);
}