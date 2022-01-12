@java.lang.Override
public long getItemId(int position) {
    if (!(this.filteredUserResponseItemsArray.isEmpty())) {
        return this.filteredUserResponseItemsArray.get(position).getId();
    }else {
        return 0;
    }
}