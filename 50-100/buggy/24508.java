private void createGraphic(java.lang.Boolean is_graphic) {
    if (is_graphic) {
        graphicViev.setVisibility(View.VISIBLE);
        graphicTask = ((com.example.termowidget.GraphicTask) (getLastNonConfigurationInstance()));
        if ((graphicTask) == null) {
            graphicTask = new com.example.termowidget.GraphicTask(this, com.example.termowidget.ConfigActivity.graphicPeriod);
            graphicTask.execute();
        }else {
            graphicTask.link(this);
        }
    }else {
        graphicViev.setVisibility(View.INVISIBLE);
    }
}