@android.support.annotation.Nullable
@java.lang.Override
public edu.gatech.ledpathways.ledpathways.objects.Employee getItem(int position) {
    if (((mListFiltered) != null) && ((mListFiltered.size()) > 0)) {
        return mListFiltered.get(position);
    }
    return super.getItem(position);
}