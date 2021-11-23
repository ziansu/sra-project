public static void addSource(model.Source s) {
    main.SourceRep.id2source.put(s.getId().toString(), s);
}