@android.support.annotation.NonNull
@java.lang.Override
public android.view.View getView(int position, android.view.View convertView, @android.support.annotation.NonNull
android.view.ViewGroup parent) {
    android.view.View view;
    if (convertView == null) {
        view = android.view.View.inflate(context, R.layout.shopping_list_item, null);
    }else {
        view = convertView;
    }
    java.lang.String itemName = items.get(position);
    android.widget.CheckBox checkBox = ((android.widget.CheckBox) (view.findViewById(R.id.checkBox)));
    checkBox.setText(itemName);
    return view;
}