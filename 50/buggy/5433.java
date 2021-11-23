@java.lang.Override
public void onBindViewHolder(cn.six.sup.rv.RvViewHolder holder, int position) {
    if ((data) != null) {
        apply(holder, data.get(position), position);
    }
}