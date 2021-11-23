@java.lang.Override
public void setUserVisibleHint(boolean isVisibleToUser) {
    super.setUserVisibleHint(isVisibleToUser);
    if (isVisibleToUser && (firstShow)) {
        this.fetchDataFromServer(FetchType.FETCH_TYPE_REFRESH);
        firstShow = false;
    }
}