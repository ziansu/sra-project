private void initBarChartButton(android.view.View view) {
    android.widget.ImageView mBarChartButton;
    if (getContext().getResources().getBoolean(R.bool.tint_icon)) {
        mBarChartButton = ((android.widget.ImageView) (view.findViewById(R.id.button_main_section_bar_chart)));
        mBarChartButton.setColorFilter(android.support.v4.content.ContextCompat.getColor(getActivity(), R.color.search_box_grey));
    }else {
        mBarChartButton = ((android.widget.ImageView) (view.findViewById(R.id.button_extras_section_bar_chart)));
        mBarChartButton.setVisibility(View.VISIBLE);
    }
    mBarChartButton.setOnClickListener(this);
}