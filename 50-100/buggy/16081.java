private static void SVGGenerator() {
    try {
        int cnt = 0;
        java.lang.String str = com.farzad.utils.image.GenerateSVG.getModelSVGs(mainCls.getModelFromFile());
        java.lang.System.out.println(str);
        com.farzad.utils.io.FileUtils.WriteToHTML(str.toString());
    } catch (java.lang.Exception ex) {
        ex.printStackTrace();
    }
}