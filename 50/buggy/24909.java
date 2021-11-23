public geogebra.common.util.LaTeXCache getLaTeXCache() {
    if ((latexCache) == null) {
        LaTeXFactory.prototype.newLaTeXCache();
    }
    return latexCache;
}