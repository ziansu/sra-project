private static void clearOldImages(com.esaych.calc.TextBookLoc loc) {
    for (com.esaych.calc.TextBookLoc tempLoc : com.esaych.calc.ImageCache.cacheMap.keySet()) {
        if ((java.lang.Math.abs(((java.lang.Integer.parseInt(tempLoc.getProblem())) - (java.lang.Integer.parseInt(loc.getProblem()))))) > 4) {
            com.esaych.calc.ImageCache.cacheMap.remove(tempLoc);
            break;
        }
    }
}