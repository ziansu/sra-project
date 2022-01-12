public static java.lang.String getTheorySlidePath(java.lang.String slide) {
    java.lang.String slide_short = slide.replaceAll("(/)(((([^/\n]*)(/)){9}))", "").replaceAll(".html", "");
    java.lang.String path_short = slide.replaceAll(".*(localmh/MathHub/)", "").replaceAll("(export).*", "");
    java.lang.String theorySlidePath = path_short + slide_short;
    return theorySlidePath;
}