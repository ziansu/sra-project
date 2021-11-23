public void colorize() {
    int color = ((com.laxen.auxiliaire.MainActivity) (getContext())).getJobsModel().getCatToColor().get(currentJob.getKind());
    rippleView.setBackgroundColor(color);
    rippleBackView.setBackgroundColor(getResources().getColor(color));
}