@java.lang.Override
public void run() {
    android.util.Log.i("EVENT :", "당겨서 새로고침 중...");
    scrap_folder_recyclerrefreshview.pullRefreshComplete();
    init_scrap_folder_list();
    get_ScrapFolder_Data();
    scrap_folder_recyclerview.removeHeaderView(headerview);
}