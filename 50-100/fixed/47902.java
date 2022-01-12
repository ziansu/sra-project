public static void addItemToList(com.teamvallartas.autodue.TaskModel model) {
    (com.teamvallartas.autodue.RecyclerViewDemoActivity.itemCount)++;
    int position = ((android.support.v7.widget.LinearLayoutManager) (com.teamvallartas.autodue.RecyclerViewDemoActivity.recyclerView.getLayoutManager())).findFirstVisibleItemPosition();
    position++;
    com.teamvallartas.autodue.RecyclerViewDemoApp.addItemToList(model);
    com.teamvallartas.autodue.RecyclerViewDemoActivity.adapter.addData(model, 0);
    com.teamvallartas.autodue.RecyclerViewDemoActivity.addToFile(model);
}