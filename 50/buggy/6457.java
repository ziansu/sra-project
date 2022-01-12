@java.lang.Override
public java.lang.String[] getUsageExamples() {
    final java.lang.String data = org.openstreetmap.josm.tools.Utils.encodeUrl("<osm version='0.6'><node id='-1' lat='1' lon='2' /></osm>");
    return new java.lang.String[]{ "/load_data?layer_name=extra_layer&new_layer=true&data=" + data };
}