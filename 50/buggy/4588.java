@java.lang.Override
public int getItemViewType(int position) {
    if ((listItems) == null) {
        return 0;
    }
    java.lang.Object object = getItem(position);
    return io.nlopez.smartadapters.utils.Mapper.viewTypeFromViewClass(builder.viewType(object, position, mapper));
}