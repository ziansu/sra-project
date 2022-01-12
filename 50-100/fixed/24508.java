private void createGraphic(java.lang.Boolean is_graphic) {
    graphicTask = ((com.example.termowidget.GraphicTask) (getLastNonConfigurationInstance()));
    if ((graphicTask) != null) {
        graphicTask.link(this);
    }else
        if (is_graphic) {
            graphicTask = new com.example.termowidget.GraphicTask(this, com.example.termowidget.ConfigActivity.graphicPeriod);
            graphicTask.execute();
        }else {
        }
    
    if (is_graphic) {
        graphicViev.setVisibility(View.VISIBLE);
    }else {
        graphicViev.setVisibility(View.INVISIBLE);
    }
}