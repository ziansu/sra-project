private java.lang.String[] getFitnesseCmd() {
    java.io.File jarFitnesse = new java.io.File(getParameter("fitnesseJarPath"));
    java.lang.String javaExtParams = getParameter("fitnesseJavaParam", "");
    return new java.lang.String[]{ "java" , javaExtParams , "-jar" , jarFitnesse.getAbsolutePath() , "-p" , "" + (getPort()) };
}