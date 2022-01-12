public void colorize() {
    int color = ((com.laxen.auxiliaire.MainActivity) (getContext())).getJobsModel().getCatToColor().get(currentJob.getKind());
    rippleView.setBackgroundColor(getResources().getColor(color));
    rippleBackView.setBackgroundColor(getResources().getColor(color));
}