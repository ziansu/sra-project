public boolean match(SNP s, Gene g) {
    if (g.region.expand(100000).contains(s.getLocation())) {
        return true;
    }else {
        return false;
    }
}