@java.lang.Override
public void run() {
    com.jjoe64.graphview.GraphView grafico = ((com.jjoe64.graphview.GraphView) (findViewById(R.id.grafica)));
    grafico.clearAnimation();
    grafico.setVisibility(View.GONE);
}