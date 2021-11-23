@java.lang.Override
public void onBindViewHolder(com.lufficc.demolightadapter.model.TextModel textModel, com.lufficc.demolightadapter.viewprovider.TextViewProvider.TextViewHolder viewHolder) {
    viewHolder.textView.setText(textModel.getText());
}