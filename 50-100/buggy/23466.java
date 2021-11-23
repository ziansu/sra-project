public main.steiner_tree call(scala.Tuple2<java.lang.String, java.util.ArrayList<java.lang.String>> ls) throws java.io.IOException {
    main.app.ms1 = com.jiao.hierarachy.HierarchyMapSerializable.loadMapData(new java.io.File(fr1), true, 1);
    main.app.entleaf = main.app.ms1.ent;
    java.lang.String disfr = (main.app.spath) + "EdgeDisMatrix.csv";
    main.cluster_data dataAction = main.app.getDataAction(disfr, main.app.entleaf.get(ls._1));
    java.lang.System.out.println("*******************\there is map process !!!!\t****************");
    main.steiner_tree local_st = main.app.getlocalst(dataAction, ls._2);
    local_st.cluster_number = ls._1;
    return local_st;
}