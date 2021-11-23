@java.lang.Override
public android.view.View getView(int position, android.view.View convertView, android.view.ViewGroup parent) {
    com.xxboy.log.Logger.debug(("Loading: " + position));
    com.xxboy.utils.XQueueUtil.addMaskTask(position);
    android.view.View resultView = createViewFromResource(position, convertView, parent, this.mData.get(position).getResource());
    resultView.setOnClickListener(this.clickListener);
    return resultView;
}