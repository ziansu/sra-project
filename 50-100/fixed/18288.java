private void initTabsMap(android.content.Context context) {
    tabs = new java.util.HashMap<>();
    java.util.List<ru.velkonost.lume.descriptions.BoardColumn> boardColumns = ru.velkonost.lume.Depository.getBoardColumns();
    for (int i = 0; i < (boardColumns.size()); i++) {
        tabs.put(i, ru.velkonost.lume.fragments.ColumnFragment.getInstance(context, boardColumns.get(i).getId(), boardColumns.get(i).getName()));
    }
}