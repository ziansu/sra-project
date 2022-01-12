public void replace(int position, com.example.hcrunning.app.TimeInterval interval) {
    android.widget.TextView oldView = this.getItem(position);
    this.remove(oldView);
    this.mIntervals.remove(position);
    mIntervals.set(position, interval);
    android.widget.TextView textView = ((android.widget.TextView) (mParentActivity.findViewById(R.id.textView)));
    textView.setText(interval.toString());
    this.insert(textView, position);
}