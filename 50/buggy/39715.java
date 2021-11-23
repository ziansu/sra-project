@java.lang.Override
public int getCount() {
    return (mListFiltered.size()) > 0 ? mListFiltered.size() : mList.size();
}