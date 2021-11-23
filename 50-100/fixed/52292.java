private void store(java.util.List<edu.cmu.sv.webcrawler.util.Term> list) {
    edu.cmu.sv.webcrawler.util.BasicDBObject doc = new edu.cmu.sv.webcrawler.util.BasicDBObject();
    featureCollection.remove(doc);
    for (edu.cmu.sv.webcrawler.util.Term term : list) {
        edu.cmu.sv.webcrawler.util.BasicDBObject obj = new edu.cmu.sv.webcrawler.util.BasicDBObject();
        obj.put("key", term.key);
        obj.put("weight", term.weight);
        obj.put("category", term.category);
        featureCollection.insert(obj);
    }
}