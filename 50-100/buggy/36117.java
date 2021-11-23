protected void replaceAllDataModels() {
    java.util.List<info.xudshen.android.playground.recyclerview.adapter2.AbstractModel<?>> newModels = new java.util.ArrayList<>();
    newModels.addAll(headers.values());
    if (isDataListEmpty()) {
        newModels.add(emptyViewModel);
    }else {
        newModels.addAll(transDataList(dataList));
        if (hasMore)
            newModels.add(loadMoreModel);
        
    }
    newModels.addAll(footers.values());
    replaceAllModels(newModels);
}