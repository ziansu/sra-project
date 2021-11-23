public org.jsoup.select.Elements parse(org.jsoup.select.Elements r) {
    if (r != null) {
        results = r.select(" tr.productListing-odd");
        resultsEven = r.select(" tr.productListing-even");
        for (int j = 0; j < (resultsEven.size()); j++) {
            results.add(resultsEven.get(j));
        }
        java.lang.System.out.println(((results.size()) + " Results have been returned from CanadaComputers."));
        return results;
    }else {
        return null;
    }
}