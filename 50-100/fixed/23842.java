@java.lang.Override
public android.view.View getView(int position, android.view.View convertView, android.view.ViewGroup parent) {
    com.example.tree.bean.Node node = mNodes.get(position);
    convertView = getConvertView(node, position, convertView, parent);
    convertView.setPadding(30, 0, 0, 0);
    return convertView;
}