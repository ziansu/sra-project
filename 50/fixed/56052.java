@java.lang.Override
public int getItemViewType(int position) {
    if ((listItems) == null) {
        return 0;
    }
    java.lang.Object object = listItems.get(position);
    return mapper.viewTypeFromViewClass(builder.viewType(object, position, mapper));
}