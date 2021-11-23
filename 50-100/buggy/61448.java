public void blowAwayViews() {
    android.view.animation.Animation rotate_out = android.view.animation.AnimationUtils.loadAnimation(this.getActivity(), R.anim.rotate_out);
    rotate_out.setDuration(1000);
    getActivity().findViewById(R.id.windmill).startAnimation(rotate_out);
    getActivity().findViewById(R.id.list_item_forecast_textview).startAnimation(rotate_out);
    getActivity().findViewById(R.id.list_item_icon).startAnimation(rotate_out);
}