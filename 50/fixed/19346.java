@java.lang.Override
public void setUserVisibleHint(boolean isVisibleToUser) {
    super.setUserVisibleHint(isVisibleToUser);
    this.fetchDataFromServer(FetchType.FETCH_TYPE_REFRESH);
    firstShow = false;
}