private java.util.List<java.lang.Integer> getFPtypeCorrespondence(cz.fidentis.comparison.procrustes.ProcrustesAnalysis pa) {
    java.util.List<java.lang.Integer> correspondence = new java.util.ArrayList<>();
    for (java.lang.Integer ft : config.keySet()) {
        if ((!(config.get(ft).isActive())) || (!(pa.isPointActive(ft))))
            continue;
        
        correspondence.add(ft);
    }
    return correspondence;
}