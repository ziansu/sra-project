@java.lang.Override
public void update(java.util.Observable o, java.lang.Object arg) {
    if ((o.getClass()) == (trestview.machinetest.module4.Module4Model.class)) {
        trestview.machinetest.module4.Module4Model m4 = ((trestview.machinetest.module4.Module4Model) (o));
        redrawChart(lineChart, m4.getExpectedValues(), null, m4.getConstantVal(), series, series2);
        redrawChart(lineChart2, m4.getTemps(), null, m4.getConstantVal(), series3, series4);
    }
}