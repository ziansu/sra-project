@java.lang.Override
public void onViewCreated(android.view.View view, android.os.Bundle savedInstanceState) {
    super.onViewCreated(view, savedInstanceState);
    com.example.joeroger.samplefragments.fragment.DynamicFragment.ViewHolder holder = new com.example.joeroger.samplefragments.fragment.DynamicFragment.ViewHolder(view);
    view.setTag(view);
    holder.textView.setText(text);
    holder.xmlFragmentButton.setOnClickListener(this);
    holder.dialogFragmentButton.setOnClickListener(this);
}